package com.example.testapp.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.caiyunapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    inline fun <reified T> create() = retrofit.create(T::class.java)    //创建动态代理对象
}