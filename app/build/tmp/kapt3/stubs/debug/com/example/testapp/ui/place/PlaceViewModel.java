package com.example.testapp.ui.place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R:\u0010\u0014\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0007 \u0016*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0007\u0018\u00010\u00150\u00150\u0006\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/testapp/ui/place/PlaceViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allCityNames", "Landroidx/lifecycle/LiveData;", "", "", "getAllCityNames", "()Landroidx/lifecycle/LiveData;", "cityDao", "Lcom/example/testapp/logic/dao/CityDao;", "cityRepository", "Lcom/example/testapp/logic/CityRepository;", "placeList", "Ljava/util/ArrayList;", "Lcom/example/testapp/logic/model/Place;", "getPlaceList", "()Ljava/util/ArrayList;", "placesLiveData", "Lkotlin/Result;", "kotlin.jvm.PlatformType", "getPlacesLiveData", "queryLiveData", "Landroidx/lifecycle/MutableLiveData;", "getPlace", "insertCity", "Lkotlinx/coroutines/Job;", "city", "Lcom/example/testapp/logic/model/City;", "isPlaceSaved", "", "queryPlaces", "", "name", "savePlace", "place", "app_debug"})
public final class PlaceViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryLiveData = null;
    private final com.example.testapp.logic.dao.CityDao cityDao = null;
    private final com.example.testapp.logic.CityRepository cityRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> allCityNames = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.testapp.logic.model.Place> placeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.testapp.logic.model.Place>>> placesLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllCityNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.testapp.logic.model.Place> getPlaceList() {
        return null;
    }
    
    public final void queryPlaces(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.testapp.logic.model.Place>>> getPlacesLiveData() {
        return null;
    }
    
    public final void savePlace(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.Place place) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapp.logic.model.Place getPlace() {
        return null;
    }
    
    public final boolean isPlaceSaved() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertCity(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.City city) {
        return null;
    }
    
    public PlaceViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}