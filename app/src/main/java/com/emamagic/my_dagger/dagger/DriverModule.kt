package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DriverModule {

    @Singleton
    @JvmStatic
    @Provides
    fun provideDriver(): Driver = Driver()


}