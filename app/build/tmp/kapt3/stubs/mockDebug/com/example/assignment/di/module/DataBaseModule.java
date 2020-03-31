package com.example.assignment.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/assignment/di/module/DataBaseModule;", "", "()V", "provideRoomDatabase", "Lcom/example/assignment/model/database/AppDatabase;", "application", "Landroid/app/Application;", "provideUserDao", "Lcom/example/assignment/model/database/dao/RepoDao;", "appDataBase", "app_mockDebug"})
@dagger.Module()
public final class DataBaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.assignment.model.database.AppDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.assignment.model.database.dao.RepoDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.example.assignment.model.database.AppDatabase appDataBase) {
        return null;
    }
    
    public DataBaseModule() {
        super();
    }
}