package com.example.testapp.ui.place

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.testapp.logic.Repository
import com.example.testapp.logic.model.Place

class PlaceViewModel: ViewModel() {
    private val queryLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()

    fun queryPlaces(name: String){
        queryLiveData.value = name
    }

    val placesLiveData = Transformations.switchMap(queryLiveData){
            name->
            Repository.searchPlaces(name)
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getPlace() = Repository.getPlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()
}