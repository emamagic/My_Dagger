package com.emamagic.my_dagger.di

import com.emamagic.my_dagger.car.Car1
import com.emamagic.my_dagger.car.Car2
import com.emamagic.my_dagger.car.Driver
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface CarModuleSet {

    @Binds
    @IntoSet
    fun bindCar1(car1: Car1): Driver

    @Binds
    @IntoSet
    fun bindCar2(car2: Car2): Driver


/*    companion object {
        @ElementsIntoSet
        @Provides
        fun provideDriver(): Set<Driver> =
            setOf(
                Car1(),
                Car2()
            )
    }*/
}