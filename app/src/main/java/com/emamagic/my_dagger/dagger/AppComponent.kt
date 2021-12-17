package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver

}