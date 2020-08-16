package com.example.testapp.logic.model

import java.util.*

data class DailyResponse(val status: String, val result: Result) {//data类对数据做了一个很好的封装

    data class Result(val daily: Daily)

    data class Daily(val astro: List<Astro>, val temperature: List<Temperature>, val skycon: List<Skycon>)

    data class Astro(val sunrise: Sunrise, val sunset: Sunset)

    data class Sunrise(val time: String)

    data class Sunset(val time: String)

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val date: Date, val value: String)

}