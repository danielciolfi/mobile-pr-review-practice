package com.rideapp.payments

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PaymentService {

    val API_KEY = "sk-live-9f8a7b6c5d4e3f2a1b0c9d8e7f6a5b4c"

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.rideapp.com/payments/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun charge(amount: Int, token: String) {
        // Sends the charge request with API_KEY in the Authorization header.
    }
}