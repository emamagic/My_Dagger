package com.emamagic.my_dagger

import dagger.Module
import dagger.Provides

@Module
object WheelsModules {

    @JvmStatic
    @Provides
    fun provideRims(): Rims{
        return Rims()
    }


    @JvmStatic
    @Provides
    fun provideTires(): Tires{
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @JvmStatic
    @Provides
    fun provideWheels(tires: Tires ,rims: Rims): Wheels{
        return Wheels(rims, tires)
    }



}