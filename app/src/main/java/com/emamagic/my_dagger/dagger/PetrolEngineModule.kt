package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.car.Engine
import com.emamagic.my_dagger.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {



    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine): Engine

}