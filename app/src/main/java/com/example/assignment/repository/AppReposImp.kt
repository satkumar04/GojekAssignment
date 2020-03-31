package com.example.assignment.repository

import com.example.assignment.api.ApiError
import com.example.assignment.api.ApiService
import com.example.assignment.model.database.AppDatabase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class AppReposImp(
    private val apiService: ApiService,
    private val database: AppDatabase
) : AppRepository {

    override fun getRepo(callback: OperationCallBack): Disposable {
        return apiService.getRepo("english")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onLoading() }
            .doOnTerminate { callback.onTerminate() }
            .subscribe(
                { result ->
                    callback.onSuccess(result)
                },
                {
                    callback.onFailure(
                        ApiError(
                            ApiError.ApiStatus.EMPTY_RESPONSE,
                            1,
                            it.localizedMessage
                        )
                    )
                }
            )
    }


    //The below code which can be used to handle Offline Mechanism through Room DataBase


    /*override fun getRepo(callback: OperationCallBack): Disposable {
     return Observable.fromCallable{database.repoDao().all}
         .concatMap {
                 dbPostList ->
             if(dbPostList.isEmpty())
                 apiService.getRepo("english").concatMap {
                         apiRestList -> database.repoDao().insertAll(apiRestList)
                     Observable.just(apiRestList)
                 }
             else
                 Observable.just(dbPostList)
         }
         .subscribeOn(Schedulers.io())
         .observeOn(AndroidSchedulers.mainThread())
         .doOnSubscribe { callback.onLoading() }
         .doOnTerminate { callback.onTerminate() }
         .subscribe(
             {
                     result ->  callback.onSuccess(result)
             },
             {
                 callback.onFailure(ApiError(ApiError.ApiStatus.EMPTY_RESPONSE,1,it.localizedMessage))
             }
         )
  }
*/

}
