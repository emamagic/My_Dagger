package com.emamagic.my_dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {

    private val TAG = "Car"

    fun drive() {
        Log.e(TAG, "driving ...")
    }
}