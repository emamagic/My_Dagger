package com.emamagic.my_dagger.car

import android.util.Log
import com.emamagic.my_dagger.dagger.PerActivity
import javax.inject.Inject

@PerActivity
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