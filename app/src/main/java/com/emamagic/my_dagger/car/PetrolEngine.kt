package com.emamagic.my_dagger.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse power")
    private val horsePower: Int,
    @Named("engine capacity")
    private val engineCapacity: Int
): Engine {


    override fun start() {
        Log.e("TAG", "start PetrolEngine." +
                "\n horsePower is $horsePower" +
                "\n engineCapacity is $engineCapacity")
    }
}