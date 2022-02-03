package com.example.jetpackgooglesignin.api.request

import com.example.jetpackgooglesignin.api.model.Contacts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface PeopleApiRequest {

    @GET("people/me/connections")
    suspend fun getContacts(
        @Header("Authorization") token: String,
        @Query("personFields") contactsData: String
    ): Response<Contacts>

}