package com.example.jetpackgooglesignin.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.jetpackgooglesignin.api.Repository
import com.example.jetpackgooglesignin.api.model.Contacts

class MainViewModel {

    val repository = Repository()

    var contacts by mutableStateOf(
        Contacts(listOf())
    )

    fun getContacts(accessToken: String) {
        repository.getContacts(accessToken) { contacts = it }
    }

}