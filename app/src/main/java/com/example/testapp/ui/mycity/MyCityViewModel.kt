package com.example.testapp.ui.mycity

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.testapp.logic.CityDatabase
import com.example.testapp.logic.CityRepository
import com.example.testapp.logic.Repository
import com.example.testapp.logic.model.City
import com.example.testapp.logic.model.Place
import kotlinx.coroutines.launch

class MyCityViewModel(application: Application): AndroidViewModel(application){
    val allCities: LiveData<List<City>>
    private val cityRepository: CityRepository

    init {
        val cityDao = CityDatabase.getCityDatabase(application).cityDao()
        cityRepository = CityRepository(cityDao)
        allCities = cityRepository.allCities
    }

    fun insertCity(city: City) = viewModelScope.launch {
        cityRepository.insertCity(city)
    }

    fun deleteCity(city: City) = viewModelScope.launch {
        cityRepository.deleteCity(city)
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

}