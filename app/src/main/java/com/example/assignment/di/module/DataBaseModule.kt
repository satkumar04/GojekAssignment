package com.example.assignment.di.module

import android.app.Application
import androidx.room.Room

import com.example.assignment.model.database.AppDatabase
import com.example.assignment.model.database.dao.RepoDao
import dagger.Module
import dagger.Provides

import javax.inject.Singleton

@Module
class DataBaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(application: Application): AppDatabase {
        return Room
            .databaseBuilder(application, AppDatabase::class.java, AppDatabase.DB_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideUserDao(appDataBase: AppDatabase): RepoDao {
        return appDataBase.repoDao()
    }
}

