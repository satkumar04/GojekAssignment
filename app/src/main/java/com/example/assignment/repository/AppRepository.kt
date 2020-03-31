package com.example.assignment.repository

import io.reactivex.disposables.Disposable

interface AppRepository {
    fun getRepo(callback: OperationCallBack): Disposable
}