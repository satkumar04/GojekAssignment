package com.example.assignment.di.builder


import androidx.lifecycle.ViewModel
import com.example.assignment.di.qualifier.ViewModelKey
import com.example.assignment.viewmodel.AppViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class AppViewModelBuilder {
    @Binds
    @IntoMap
    @ViewModelKey(AppViewModel::class)
    abstract fun bindAppViewModel(appViewModel: AppViewModel): ViewModel



}