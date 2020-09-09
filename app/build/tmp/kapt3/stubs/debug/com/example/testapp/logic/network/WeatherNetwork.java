package com.example.testapp.logic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/testapp/logic/network/WeatherNetwork;", "", "()V", "placeService", "Lcom/example/testapp/logic/network/PlaceService;", "weatherService", "Lcom/example/testapp/logic/network/WeatherService;", "getDailyWeather", "Lcom/example/testapp/logic/model/DailyResponse;", "lng", "", "lat", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHourlyWeather", "Lcom/example/testapp/logic/model/HourlyResponse;", "getPlace", "Lcom/example/testapp/logic/model/PlaceResponse;", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealtimeWeather", "Lcom/example/testapp/logic/model/RealtimeResponse;", "app_debug"})
public final class WeatherNetwork {
    private static final com.example.testapp.logic.network.PlaceService placeService = null;
    private static final com.example.testapp.logic.network.WeatherService weatherService = null;
    public static final com.example.testapp.logic.network.WeatherNetwork INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.PlaceResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRealtimeWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.RealtimeResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDailyWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.DailyResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHourlyWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.HourlyResponse> p2) {
        return null;
    }
    
    private WeatherNetwork() {
        super();
    }
}