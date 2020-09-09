package com.example.testapp.ui.place

import com.example.testapp.logic.model.City

interface DatabaseImpl {
    fun insertCity(city: City)

    fun queryAllNames(): List<String>
}