package com.example.jetpackgooglesignin.api.client

import com.example.jetpackgooglesignin.api.request.PeopleApiRequest
import com.example.jetpackgooglesignin.common.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    val api = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
        .create(PeopleApiRequest::class.java)

}