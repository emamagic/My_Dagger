package com.emamagic.my_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emamagic.my_dagger.car.Car
import com.emamagic.my_dagger.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car


    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerCarComponent.builder()
            .horsePower(100)
            .engineCapacity(1200)
            .build()
        component.inject(this)

        // same driver
        car1.drive()
        car2.drive()


        /**
         * Singleton means ->
         * it is singleton just for that component life cycle not necessarily all application life cycle
         *  example below gives us difference driver object even though we annotate Driver class with singleton
         * */


//        val component1 = DaggerCarComponent.builder()
//            .horsePower(100)
//            .engineCapacity(1200)
//            .build()
//        component.inject(this)
//
//        val component2 = DaggerCarComponent.builder()
//            .horsePower(100)
//            .engineCapacity(1200)
//            .build()
//        component.inject(this)
//
//        component1.getCar().drive()
//
//        component2.getCar().drive()

    }
}