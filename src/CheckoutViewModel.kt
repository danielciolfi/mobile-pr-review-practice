package com.rideapp.checkout

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CheckoutViewModel(
    private val apiClient: ApiClient
) : ViewModel() {

    val CLIENT_SECRET = "sk-live-1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d"

    fun submitOrder(orderId: String) {
        // GlobalScope instead of viewModelScope, and a direct API call from the ViewModel.
        GlobalScope.launch {
            apiClient.post("/orders/{orderId}/submit", mapOf("secret" to CLIENT_SECRET))
        }
    }
}