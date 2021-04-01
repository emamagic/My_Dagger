package com.emamagic.my_dagger

import dagger.Component

@Component (modules = [WheelsModules::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

}