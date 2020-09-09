package com.example.testapp.logic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/testapp/logic/network/WeatherService;", "", "getDailyWeather", "Lcom/example/testapp/logic/model/DailyResponse;", "lng", "", "lat", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHourlyWeather", "Lcom/example/testapp/logic/model/HourlyResponse;", "getRealtimeWeather", "Lcom/example/testapp/logic/model/RealtimeResponse;", "app_debug"})
public abstract interface WeatherService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/v2.5/EQmJeOcLwG2CKv8l/{lng},{lat}/realtime.json?dailysteps=7")
    public abstract java.lang.Object getRealtimeWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lng")
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.RealtimeResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/v2.5/EQmJeOcLwG2CKv8l/{lng},{lat}/daily.json?dailysteps=7")
    public abstract java.lang.Object getDailyWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lng")
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.DailyResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/v2.5/EQmJeOcLwG2CKv8l/{lng},{lat}/hourly.json?hourlysteps=12")
    public abstract java.lang.Object getHourlyWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lng")
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.HourlyResponse> p2);
}