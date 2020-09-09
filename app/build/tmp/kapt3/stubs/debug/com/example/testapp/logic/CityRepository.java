package com.example.testapp.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/testapp/logic/CityRepository;", "", "cityDao", "Lcom/example/testapp/logic/dao/CityDao;", "(Lcom/example/testapp/logic/dao/CityDao;)V", "allCities", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/testapp/logic/model/City;", "getAllCities", "()Landroidx/lifecycle/LiveData;", "allCityNames", "", "getAllCityNames", "deleteCity", "", "city", "(Lcom/example/testapp/logic/model/City;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCity", "app_debug"})
public final class CityRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.testapp.logic.model.City>> allCities = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> allCityNames = null;
    private final com.example.testapp.logic.dao.CityDao cityDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.testapp.logic.model.City>> getAllCities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllCityNames() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.City city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCity(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.model.City city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public CityRepository(@org.jetbrains.annotations.NotNull()
    com.example.testapp.logic.dao.CityDao cityDao) {
        super();
    }
}