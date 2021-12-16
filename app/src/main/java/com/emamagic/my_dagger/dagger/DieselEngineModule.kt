package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.car.DieselEngine
import com.emamagic.my_dagger.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun provideEngine(horsePower: Int): Engine {
        return DieselEngine(horsePower)
    }

}