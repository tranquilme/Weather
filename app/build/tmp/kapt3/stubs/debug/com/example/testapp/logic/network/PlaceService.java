package com.example.testapp.logic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/testapp/logic/network/PlaceService;", "", "getData", "Lcom/example/testapp/logic/model/PlaceResponse;", "query", "", "token", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PlaceService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/place")
    public abstract java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapp.logic.model.PlaceResponse> p3);
}