package com.example.testapp.ui.weather

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.testapp.logic.Repository
import com.example.testapp.logic.model.Location
import com.example.testapp.logic.model.Weather

class WeatherViewModel: ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()

    var name = ""

    var lng = ""

    var lat = ""

    fun refresh(lng: String, lat: String){
        locationLiveData.value = Location(lng, lat)
    }

    val weatherLiveData = Transformations.switchMap(locationLiveData){
        location->
        Repository.refreshWeather(location.lng, location.lat)
    }
}