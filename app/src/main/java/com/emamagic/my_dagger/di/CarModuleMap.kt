package com.emamagic.my_dagger.di

import com.emamagic.my_dagger.car.Car1
import com.emamagic.my_dagger.car.Car2
import com.emamagic.my_dagger.car.Driver
import dagger.Binds
import dagger.Module
import dagger.multibindings.*

@Module
interface CarModuleMap {

    @Binds
    @IntoMap
    @StringKey("car1")
    fun bindCar1(car1: Car1): Driver

    @Binds
    @IntoMap
    @StringKey("car2")
    fun bindCar2(car2: Car2): Driver

/*    @Binds
    @IntoMap
    @ClassKey(Car1::class)
    fun bindCar1(car1: Car1): Driver

    @Binds
    @IntoMap
    @ClassKey(Car2::class)
    fun bindCar2(car2: Car2): Driver*/

//   ****************** also you can have own key ***********************

/* @Multibinds
 fun multibindsCar(): Map<Class<*>, Driver>*/

}