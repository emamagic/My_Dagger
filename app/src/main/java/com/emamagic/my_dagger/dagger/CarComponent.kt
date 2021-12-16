package com.emamagic.my_dagger.dagger

import com.emamagic.my_dagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component (modules = [WheelsModules::class , PetrolEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder
        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }

}