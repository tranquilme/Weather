package com.example.testapp.logic.network

import com.example.testapp.WeatherApplication
import com.example.testapp.logic.model.DailyResponse
import com.example.testapp.logic.model.HourlyResponse
import com.example.testapp.logic.model.RealtimeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("/v2.5/${WeatherApplication.token}/{lng},{lat}/realtime?alert=true")
    suspend fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):RealtimeResponse

    @GET("/v2.5/${WeatherApplication.token}/{lng},{lat}/daily.json?dailysteps=7")
    suspend fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): DailyResponse

    @GET("/v2.5/${WeatherApplication.token}/{lng},{lat}/hourly.json?hourlysteps=12")
    suspend fun getHourlyWeather(@Path("lng") lng: String, @Path("lat") lat: String): HourlyResponse
}