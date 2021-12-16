package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    companion object {
        @Singleton
        @JvmStatic
        @Provides
        fun provideDriver(): Driver = Driver()
    }

}