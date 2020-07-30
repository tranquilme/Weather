package com.example.testapp.logic.network

import com.example.testapp.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {//发起请求
    @GET("v2/place")
    suspend fun getData(@Query("query") query: String,      //自动开启子线程
                @Query("token") token: String,
                @Query("lang") lang: String
                ):PlaceResponse
}