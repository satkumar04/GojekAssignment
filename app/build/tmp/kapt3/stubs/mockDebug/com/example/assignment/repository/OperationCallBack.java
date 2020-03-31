package com.example.assignment.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/example/assignment/repository/OperationCallBack;", "", "onFailure", "", "apiError", "Lcom/example/assignment/api/ApiError;", "onLoading", "onSuccess", "list", "", "Lcom/example/assignment/model/database/entity/User;", "onTerminate", "app_mockDebug"})
public abstract interface OperationCallBack {
    
    public abstract void onLoading();
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.assignment.model.database.entity.User> list);
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull()
    com.example.assignment.api.ApiError apiError);
    
    public abstract void onTerminate();
}