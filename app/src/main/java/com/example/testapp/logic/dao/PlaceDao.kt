package com.example.testapp.logic.dao

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.core.content.edit
import com.example.testapp.WeatherApplication
import com.example.testapp.logic.model.Place
import com.google.gson.Gson

object PlaceDao {
    fun sharedPreferences() = WeatherApplication.context.getSharedPreferences("weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
        val pref = sharedPreferences().edit()
        pref.putString("place", Gson().toJson(place))
        pref.apply()
    }

    fun getPlace(): Place {
        val place = sharedPreferences().getString("place", "")
        return Gson().fromJson(place, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")
}