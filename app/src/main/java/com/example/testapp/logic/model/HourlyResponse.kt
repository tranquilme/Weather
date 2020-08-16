package com.example.testapp.logic.model

import java.util.*

data class HourlyResponse (val status: String, val result: Result) {
    data class Result(val hourly: Hourly)

    data class Hourly(val skycon: List<Skycon>, val temperature: List<Temperature>, val wind: List<Wind>)

    data class Skycon(val datetime: Date, val value: String)

    data class Temperature(val value: Float)

    data class Wind(val speed: Float, val direction: Float)
}