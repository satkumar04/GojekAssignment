package com.example.assignment

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import com.example.assignment.TestAppRepository.Instance.initData
import com.example.assignment.api.ApiError
import com.example.assignment.model.database.entity.User
import com.example.assignment.repository.AppRepository
import com.example.assignment.repository.OperationCallBack
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.io.InputStream
import javax.inject.Inject


class TestAppRepository @Inject constructor() : AppRepository {
    override fun getRepo(callback: OperationCallBack): Disposable {
        return initData()
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


    object Instance {
        var STATUS = DATA_STATUS.FULL_LIST
        fun initData(): Observable<MutableList<User>> {
            val gson = Gson()
            val jsonString = getJson("RepoApiResponse.json")
            val turnsType = object : TypeToken<MutableList<User>>() {}.type
            val users = Gson().fromJson<MutableList<User>>(jsonString, turnsType)
            return Observable.fromCallable { users }
        }

        fun dataError(): Observable<MutableList<User>> {
            var STATUS = DATA_STATUS.NO_INTERNET
            return Observable.error<MutableList<User>>(Exception("Error"))

        }

        private fun getJson(path: String): String {
            val ctx: Context = InstrumentationRegistry.getInstrumentation().targetContext
            val inputStream: InputStream = ctx.assets.open(path)
            return inputStream.bufferedReader().use { it.readText() }
        }
    }
}





enum class DATA_STATUS { EMPTY_LIST, FULL_LIST, NO_DATA, NO_INTERNET }
