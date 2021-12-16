package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component (modules = [WheelsModules::class , PetrolEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(horsePower: Int): Builder
        fun build(): CarComponent
    }

}