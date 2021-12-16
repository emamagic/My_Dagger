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


        val component = (application as App).getAppComponent()
        component.inject(this)

        // same driver
        car1.drive()
        car2.drive()


    }
}