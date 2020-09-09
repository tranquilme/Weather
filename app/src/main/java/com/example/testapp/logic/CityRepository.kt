package com.example.testapp.logic

import android.content.Context
import com.example.testapp.logic.dao.CityDao
import com.example.testapp.logic.model.City

class CityRepository(private val cityDao: CityDao) {
    val allCities = cityDao.queryAllCities()
    val allCityNames = cityDao.queryAllNames()

    suspend fun insertCity(city: City) {
        cityDao.insertCity(city)
    }

    suspend fun deleteCity(city: City) {
        cityDao.deleteCity(city)
    }
}