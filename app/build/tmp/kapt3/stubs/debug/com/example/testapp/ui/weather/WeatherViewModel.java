package com.example.testapp.ui.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 \u0016*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00140\u0013\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/testapp/ui/weather/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "lat", "", "getLat", "()Ljava/lang/String;", "setLat", "(Ljava/lang/String;)V", "lng", "getLng", "setLng", "locationLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/testapp/logic/model/Location;", "name", "getName", "setName", "weatherLiveData", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/testapp/logic/model/Weather;", "kotlin.jvm.PlatformType", "getWeatherLiveData", "()Landroidx/lifecycle/LiveData;", "refresh", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.testapp.logic.model.Location> locationLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lng;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lat;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Result<com.example.testapp.logic.model.Weather>> weatherLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLng() {
        return null;
    }
    
    public final void setLng(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void refresh(@org.jetbrains.annotations.NotNull()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lat) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.testapp.logic.model.Weather>> getWeatherLiveData() {
        return null;
    }
    
    public WeatherViewModel() {
        super();
    }
}