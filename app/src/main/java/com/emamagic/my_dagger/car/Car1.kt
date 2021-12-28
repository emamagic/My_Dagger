package com.emamagic.my_dagger.car

import javax.inject.Inject

class Car1 @Inject constructor(): Driver {

    override fun drive(): String {
        return "Driving Car1"
    }
}