package com.example.testapp.logic.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_city")
data class City(
    @ColumnInfo(name = "city_name") val cityName: String,
    @ColumnInfo(name = "city_lng") val lng: String,
    @ColumnInfo(name = "city_lat") val lat: String,
    @ColumnInfo(name = "city_address") val address: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}