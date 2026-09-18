package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    fun addCity(city: City, selectedCity: String, selectedProvince: String) {
        if (selectedCity != "") {
            for (i in 0..(_cities.size-1)) {
                if (_cities[i].name == selectedCity && _cities[i].province == selectedProvince) {
                    _cities[i] = city
                    return
                }
            }
            return
        }
        _cities.add(city)
    }

    val cities: List<City>
        get() = _cities
}