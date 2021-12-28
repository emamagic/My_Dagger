package com.emamagic.my_dagger.di

import com.emamagic.my_dagger.MainActivity
import dagger.Component

@Component(modules = [CarModuleMap::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

}