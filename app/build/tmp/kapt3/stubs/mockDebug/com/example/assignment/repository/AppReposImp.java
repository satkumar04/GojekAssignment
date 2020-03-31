package com.example.assignment.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/assignment/repository/AppReposImp;", "Lcom/example/assignment/repository/AppRepository;", "apiService", "Lcom/example/assignment/api/ApiService;", "database", "Lcom/example/assignment/model/database/AppDatabase;", "(Lcom/example/assignment/api/ApiService;Lcom/example/assignment/model/database/AppDatabase;)V", "getRepo", "Lio/reactivex/disposables/Disposable;", "callback", "Lcom/example/assignment/repository/OperationCallBack;", "app_mockDebug"})
public final class AppReposImp implements com.example.assignment.repository.AppRepository {
    private final com.example.assignment.api.ApiService apiService = null;
    private final com.example.assignment.model.database.AppDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.disposables.Disposable getRepo(@org.jetbrains.annotations.NotNull()
    com.example.assignment.repository.OperationCallBack callback) {
        return null;
    }
    
    public AppReposImp(@org.jetbrains.annotations.NotNull()
    com.example.assignment.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.example.assignment.model.database.AppDatabase database) {
        super();
    }
}