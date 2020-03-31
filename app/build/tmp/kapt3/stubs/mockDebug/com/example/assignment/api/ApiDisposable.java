package com.example.assignment.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BM\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0019R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/assignment/api/ApiDisposable;", "T", "Lio/reactivex/observers/DisposableObserver;", "success", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "body", "", "failure", "Lcom/example/assignment/api/ApiError;", "error", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "TAG", "", "kotlin.jvm.PlatformType", "getErrorMessage", "errorBody", "Lokhttp3/ResponseBody;", "onComplete", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "app_mockDebug"})
public final class ApiDisposable<T extends java.lang.Object> extends io.reactivex.observers.DisposableObserver<T> {
    private final java.lang.String TAG = null;
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> success = null;
    private final kotlin.jvm.functions.Function1<com.example.assignment.api.ApiError, kotlin.Unit> failure = null;
    
    @java.lang.Override()
    public void onNext(T t) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    private final java.lang.String getErrorMessage(okhttp3.ResponseBody errorBody) {
        return null;
    }
    
    public ApiDisposable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.assignment.api.ApiError, kotlin.Unit> failure) {
        super();
    }
}