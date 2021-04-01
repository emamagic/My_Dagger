package com.emamagic.my_dagger.car


class Wheels constructor(val rims: Rims, val tires: Tires) {

    // we do not own this class so we can not annotate it with @Inject

}