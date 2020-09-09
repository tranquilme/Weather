package com.example.testapp.ui.mycity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/testapp/ui/mycity/MyCityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allCities", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/testapp/logic/model/City;", "getAllCities", "()Landroidx/lifecycle/LiveData;", "cityRepository", "Lcom/example/testapp/logic/CityRepository;", "deleteCity", "Lkotlinx/coroutines/Job;", "city", "insertCity", "savePlace", "", "place", "Lcom/example/testapp/logic/model/Place;", "app_debug"})
public final class MyCityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.testapp.logic.model.City>> allCities = null;
    private final com.example.testapp.logic.CityRepository cityRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.testapp.logic.model.City>> getAllCities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertCity(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.City city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteCity(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.City city) {
        return null;
    }
    
    public final void savePlace(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.Place place) {
    }
    
    public MyCityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}