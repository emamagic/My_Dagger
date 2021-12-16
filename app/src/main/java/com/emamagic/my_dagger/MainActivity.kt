package com.emamagic.my_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emamagic.my_dagger.car.Car
import com.emamagic.my_dagger.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerCarComponent.builder()
            .horsePower(100)
            .build()
        component.inject(this)

        car.drive()


    }
}