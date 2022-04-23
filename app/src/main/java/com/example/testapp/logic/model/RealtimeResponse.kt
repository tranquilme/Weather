package com.example.testapp.logic.model

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime, val alert: AlertInfo)

    data class Realtime(val temperature: Float, val skycon: String, val air_quality: Air_Quality)

    data class Air_Quality(val aqi: Aqi)

    data class Aqi(val chn: Float)

    data class AlertInfo(val status: String, val content: List<AlertItem>)

    data class AlertItem(val title: String, val description: String)
}