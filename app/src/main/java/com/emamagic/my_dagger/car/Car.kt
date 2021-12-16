package com.emamagic.my_dagger.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels,
    private val driver: Driver
) {


    fun drive() {
        engine.start()
        Log.e("TAG", "driver $driver drive car $this")
    }
}