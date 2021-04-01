package com.emamagic.my_dagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int): Engine {

    override fun start() {
        Log.e("TAG", "start DieselEngine horsePower $horsePower")
    }
}