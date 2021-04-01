package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.MainActivity
import dagger.Component

@Component (modules = [WheelsModules::class , DieselEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

}