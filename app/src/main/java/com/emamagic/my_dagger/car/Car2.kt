package com.emamagic.my_dagger.car

import javax.inject.Inject

class Car2 @Inject constructor(): Driver {

    override fun drive(): String {
        return "Driving Car2"
    }
}