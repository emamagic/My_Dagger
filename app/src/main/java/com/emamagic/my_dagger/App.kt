package com.emamagic.my_dagger

import android.app.Application
import com.emamagic.my_dagger.dagger.AppComponent
import com.emamagic.my_dagger.dagger.DaggerAppComponent

class App: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        val component = DaggerAppComponent.create()
    }


    fun getAppComponent(): AppComponent = appComponent
}