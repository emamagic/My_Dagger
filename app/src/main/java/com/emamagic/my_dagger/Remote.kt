package com.emamagic.my_dagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.e("TAG", "Remote connected")
    }

}