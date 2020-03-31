package com.example.assignment.di

import android.app.Application
import com.example.assignment.AppTest
import com.example.assignment.di.builder.ActivityBuilder
import com.example.assignment.di.component.CoreComponent
import com.example.assignment.di.module.ContextModule
import com.example.assignment.di.module.DataBaseModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [TestDataModule::class,AndroidSupportInjectionModule::class, ContextModule::class,ActivityBuilder::class, DataBaseModule::class])
interface TestCoreComponent:CoreComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): TestCoreComponent
    }

    fun inject(app: AppTest)
}
