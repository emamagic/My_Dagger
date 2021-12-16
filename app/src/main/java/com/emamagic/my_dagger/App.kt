package com.emamagic.my_dagger

import android.app.Application
import com.emamagic.my_dagger.dagger.CarComponent
import com.emamagic.my_dagger.dagger.DaggerCarComponent

class App: Application() {

    private lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()

        val component = DaggerCarComponent.builder()
            .horsePower(100)
            .engineCapacity(1200)
            .build()
    }


    fun getAppComponent(): CarComponent = carComponent
}