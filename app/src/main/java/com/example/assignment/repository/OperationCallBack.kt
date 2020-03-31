package com.example.assignment.repository

import com.example.assignment.api.ApiError
import com.example.assignment.model.database.entity.User

interface OperationCallBack {

    fun onLoading()
    fun onSuccess(list: MutableList<User>)
    fun onFailure(apiError: ApiError)
    fun onTerminate()
 }