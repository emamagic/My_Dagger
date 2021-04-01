package com.emamagic.my_dagger

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}