package com.example.assignment.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/assignment/viewmodel/AppViewModel;", "Lcom/example/assignment/ui/base/BaseViewModel;", "appRepo", "Lcom/example/assignment/repository/AppRepository;", "(Lcom/example/assignment/repository/AppRepository;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "error", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/assignment/api/ApiError;", "getError", "()Landroidx/lifecycle/MutableLiveData;", "error$delegate", "Lkotlin/Lazy;", "repoListLiveData", "", "Lcom/example/assignment/model/database/entity/User;", "getRepoListLiveData", "repoListLiveData$delegate", "fetchRepo", "", "onCleared", "app_mockDebug"})
public final class AppViewModel extends com.example.assignment.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repoListLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy error$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.disposables.Disposable disposable;
    private final com.example.assignment.repository.AppRepository appRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.assignment.model.database.entity.User>> getRepoListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.assignment.api.ApiError> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable getDisposable() {
        return null;
    }
    
    public final void setDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable p0) {
    }
    
    public final void fetchRepo() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public AppViewModel(@org.jetbrains.annotations.NotNull()
    com.example.assignment.repository.AppRepository appRepo) {
        super();
    }
}