package com.example.assignment

import com.example.assignment.di.DaggerTestCoreComponent


class AppTest: App() {
     override fun initDagger() {
              DaggerTestCoreComponent.builder().application(this).build().inject(this)
     }
}