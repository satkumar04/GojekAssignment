package com.example.assignment.di.component


import android.app.Application
import com.example.assignment.App
import com.example.assignment.di.builder.ActivityBuilder
import com.example.assignment.di.module.ContextModule
import com.example.assignment.di.module.DataBaseModule
import com.example.assignment.di.module.NetModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,ContextModule::class,NetModule::class, ActivityBuilder::class,DataBaseModule::class])
interface CoreComponent  {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): CoreComponent
    }
   fun inject(app: App)

}


