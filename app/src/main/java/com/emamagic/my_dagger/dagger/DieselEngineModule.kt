package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.car.DieselEngine
import com.emamagic.my_dagger.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {


    @Binds
    abstract fun bindsEngine(petrolEngine: DieselEngine): Engine

}