package com.example.testapp.logic.model

data class Location(val lng: String, val lat: String)

data class Place(val name: String, val location: Location, val formatted_address: String)

data class PlaceResponse(val status: String, val places:List<Place>)