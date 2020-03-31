package com.example.assignment.di

import com.example.assignment.TestAppRepository
import com.example.assignment.repository.AppRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class TestDataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepository: TestAppRepository): AppRepository
}