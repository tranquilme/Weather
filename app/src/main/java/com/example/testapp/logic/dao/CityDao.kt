package com.example.testapp.logic.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.testapp.logic.model.City

@Dao
interface CityDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCity(city: City)

    @Delete
    suspend fun deleteCity(city: City)

    @Query("SELECT * FROM my_city")
    fun queryAllCities(): LiveData<List<City>>

    @Query("SELECT city_name FROM my_city")
    fun queryAllNames(): LiveData<List<String>>
}