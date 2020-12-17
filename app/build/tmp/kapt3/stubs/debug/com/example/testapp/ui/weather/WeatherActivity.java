package com.example.testapp.ui.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/testapp/ui/weather/WeatherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "tag", "", "viewModel", "Lcom/example/testapp/ui/weather/WeatherViewModel;", "getViewModel", "()Lcom/example/testapp/ui/weather/WeatherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "refreshWeather", "showForecast", "data", "Lcom/example/testapp/logic/model/Weather;", "showHourly", "showRealtime", "app_debug"})
public final class WeatherActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String tag = "WeatherActivity.class";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapp.ui.weather.WeatherViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showRealtime(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.Weather data) {
    }
    
    public final void showForecast(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.Weather data) {
    }
    
    public final void showHourly(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.Weather data) {
    }
    
    public final void refreshWeather() {
    }
    
    public WeatherActivity() {
        super();
    }
}