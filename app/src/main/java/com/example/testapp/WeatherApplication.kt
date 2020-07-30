package com.example.testapp

import android.app.Application
import android.content.Context

class WeatherApplication: Application() {
    companion object{
        const val token = "EQmJeOcLwG2CKv8l"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}