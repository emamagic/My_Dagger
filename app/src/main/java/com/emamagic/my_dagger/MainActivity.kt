package com.emamagic.my_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.emamagic.my_dagger.car.Driver
import com.emamagic.my_dagger.di.DaggerCarComponent
import javax.inject.Inject

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var driver: Set<@JvmSuppressWildcards Driver>

    @Inject
    lateinit var driver: Map<String, @JvmSuppressWildcards Driver>
//    lateinit var driver: Map<Class<*>, @JvmSuppressWildcards Driver>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerCarComponent.create().inject(this)

        Log.e(TAG, "onCreate: $driver")

    }
}