package com.example.testapp.logic.model

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(val temperature: Float, val skycon: String, val air_quality: Air_Quality)

    data class Air_Quality(val aqi: Aqi)

    data class Aqi(val chn: Float)
}