package com.example.assignment.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.assignment.model.database.entity.User
import com.example.assignment.repository.AppRepository
import com.example.assignment.repository.OperationCallBack
import com.example.assignment.ui.base.BaseViewModel
import io.reactivex.disposables.Disposable
import com.example.assignment.api.ApiError
import javax.inject.Inject

class AppViewModel @Inject constructor(private val appRepo: AppRepository) : BaseViewModel() {

    val  repoListLiveData: MutableLiveData<MutableList<User>> by lazy {MutableLiveData<MutableList<User>>()}
    val error: MutableLiveData<ApiError> by lazy { MutableLiveData<ApiError>() }
     lateinit var disposable : Disposable
    init {

        fetchRepo()
    }

     fun fetchRepo()
    {
        disposable = appRepo.getRepo(object:OperationCallBack
        {
            override fun onLoading() {
             }

             override fun onSuccess(list: MutableList<User>) {
                 repoListLiveData.postValue(list)            }

             override fun onFailure(apiError: ApiError) {
                 error.value = apiError
             }

             override fun onTerminate() {
             }

         })
    }


    override fun onCleared() {
        if(disposable?.isDisposed)
            disposable.dispose()
    }
}