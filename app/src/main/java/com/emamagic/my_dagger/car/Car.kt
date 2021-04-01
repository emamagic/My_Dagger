package com.emamagic.my_dagger.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {


    fun drive() {
        engine.start()
        Log.e("TAG", "driving ...")
    }
}