package com.emamagic.my_dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {

    private val TAG = "Car"


    // It not recommended to use method injection
    // the use case of that is ->
    // if you have to pass instance of the object it self to the dependency
    // because in Car constructor, we do not instance object from Car yet
    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        Log.e(TAG, "driving ...")
    }
}