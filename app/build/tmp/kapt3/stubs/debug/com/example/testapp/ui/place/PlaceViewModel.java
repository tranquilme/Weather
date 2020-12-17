package com.example.testapp.ui.place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R:\u0010\b\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b \f*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0018\u00010\n0\n0\t\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/testapp/ui/place/PlaceViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "placeList", "Ljava/util/ArrayList;", "Lcom/example/testapp/logic/model/Place;", "getPlaceList", "()Ljava/util/ArrayList;", "placesLiveData", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "kotlin.jvm.PlatformType", "getPlacesLiveData", "()Landroidx/lifecycle/LiveData;", "queryLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getPlace", "isPlaceSaved", "", "queryPlaces", "", "name", "savePlace", "place", "app_debug"})
public final class PlaceViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> queryLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.testapp.logic.model.Place> placeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.example.testapp.logic.model.Place>>> placesLiveData = null;
    
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
    
    public PlaceViewModel() {
        super();
    }
}