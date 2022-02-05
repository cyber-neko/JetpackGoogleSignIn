package com.example.jetpackgooglesignin.api

import com.example.jetpackgooglesignin.api.client.ApiClient
import com.example.jetpackgooglesignin.api.model.Contacts

class Repository {

    val apiClient = ApiClient()

    fun getContacts(accessToken: String, success: (contacts: Contacts) -> Unit) {
        apiClient.getRequest(accessToken, success)
    }

}