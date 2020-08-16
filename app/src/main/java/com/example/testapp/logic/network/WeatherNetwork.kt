package com.example.testapp.logic.network

import com.example.testapp.WeatherApplication
import com.example.testapp.logic.model.Place
import com.example.testapp.logic.model.PlaceResponse
import com.example.testapp.logic.network.PlaceService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object WeatherNetwork {
    private val placeService = ServiceCreator.create<PlaceService>()

    suspend fun getPlace(name: String) = placeService.getData(name,WeatherApplication.token, "zh_CN")
    //内部开启一个新的IO线程

    private val weatherService = ServiceCreator.create<WeatherService>()

    suspend fun getRealtimeWeather(lng: String, lat: String) = weatherService.getRealtimeWeather(lng, lat)

    suspend fun getDailyWeather(lng: String, lat: String) = weatherService.getDailyWeather(lng, lat)

    suspend fun getHourlyWeather(lng: String, lat: String) = weatherService.getHourlyWeather(lng, lat)

//    private suspend fun <T> retrofit2.Call<T>.await(): T {
//            return suspendCoroutine {       //用suspendCoroutine函数就可以在回调时返回数据
//                continuation ->
//                enqueue(object : Callback<T>{
//                    override fun onResponse(call: retrofit2.Call<T>, response: Response<T>) {
//                        val response = response.body()
//                        if (response!=null) {
//                            continuation.resume(response)//恢复被挂起的函数，同时传递数据
//                        }
//                    }
//
//                    override fun onFailure(call: retrofit2.Call<T>, t: Throwable) {
//                        continuation.resumeWithException(t)
//                    }
//                })
//            }
//    }


}