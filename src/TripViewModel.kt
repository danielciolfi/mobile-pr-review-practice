package com.rideapp.trips

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TripViewModel(
    private val apiClient: ApiClient
) : ViewModel() {

    private val _trips = MutableStateFlow<List<Trip>>(emptyList())
    val trips: StateFlow<List<Trip>> = _trips

    fun loadTrips(userId: String) {
        viewModelScope.launch {
            // Calls the API client directly from the ViewModel instead of going through a repository.
            _trips.value = apiClient.get("/users/{userId}/trips")
        }
    }
}