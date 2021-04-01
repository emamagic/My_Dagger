package com.emamagic.my_dagger.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {

    override fun start() {
        Log.e("TAG", "start PetrolEngine")
    }
}