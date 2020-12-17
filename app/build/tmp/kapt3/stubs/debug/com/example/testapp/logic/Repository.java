package com.example.testapp.logic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014\u00f8\u0001\u0000J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eJ#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u0014\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/testapp/logic/Repository;", "", "()V", "fire", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "getPlace", "Lcom/example/testapp/logic/model/Place;", "isPlaceSaved", "", "refreshWeather", "Lcom/example/testapp/logic/model/Weather;", "lng", "", "lat", "savePlace", "", "place", "searchPlaces", "", "name", "app_debug"})
public final class Repository {
    public static final com.example.testapp.logic.Repository INSTANCE = null;
    
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
    public final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.testapp.logic.model.Place>>> searchPlaces(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.testapp.logic.model.Weather>> refreshWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    java.lang.String lat) {
        return null;
    }
    
    private final <T extends java.lang.Object>androidx.lifecycle.LiveData<kotlin.Result<T>> fire(kotlin.coroutines.CoroutineContext context, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends T>>, ? extends java.lang.Object> block) {
        return null;
    }
    
    private Repository() {
        super();
    }
}