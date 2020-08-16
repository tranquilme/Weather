package com.example.testapp.logic

import androidx.lifecycle.liveData
import com.example.testapp.logic.dao.PlaceDao
import com.example.testapp.logic.model.Place
import com.example.testapp.logic.model.PlaceResponse
import com.example.testapp.logic.model.Weather
import com.example.testapp.logic.network.WeatherNetwork
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import java.lang.Exception
import java.lang.RuntimeException
import kotlin.coroutines.CoroutineContext

object Repository {
    fun savePlace(place: Place) = PlaceDao.savePlace(place)

    fun getPlace() = PlaceDao.getPlace()

    fun isPlaceSaved() = PlaceDao.isPlaceSaved()

    fun searchPlaces(name: String) = fire(Dispatchers.IO) {//此处是block()代码块，只需要写请求成功之后的逻辑，捕捉异常已经封装好了
            val placeResponse = WeatherNetwork.getPlace(name)//当前协程被挂起
            if (placeResponse.status == "ok") {
                Result.success(placeResponse.places)
            }else {
                Result.failure(RuntimeException("placeResponse.status = ${placeResponse.status}"))
            }
    }

    fun refreshWeather(lng: String, lat: String) = fire(Dispatchers.IO) {//此处是block()代码块，只需要写请求成功之后的逻辑，捕捉异常已经封装好了
            coroutineScope {
                val deferredRealtime = async {
                    WeatherNetwork.getRealtimeWeather(lng, lat)
                }
                val deferredDaily = async {
                    WeatherNetwork.getDailyWeather(lng, lat)
                }
                val defferedHourly = async {
                    WeatherNetwork.getHourlyWeather(lng, lat)
                }
                val realtime = deferredRealtime.await()
                val daily = deferredDaily.await()
                val hourly = defferedHourly.await()
                if (realtime.status == "ok" && daily.status == "ok" && hourly.status == "ok") {
                    val weather = Weather(realtime, daily, hourly)
                    Result.success(weather)
                }else{
                    Result.failure(
                        RuntimeException("realtime status is ${realtime.status}  daily status is ${daily.status}"
                        ))
                }
            }
    }

    private fun <T> fire(context: CoroutineContext, block:suspend() -> Result<T>)= liveData(context){
        val result = try {
            block()
        }catch (e: Exception) {
            Result.failure<T>(e)
        }
        emit(result)
    }
}