package com.example.jetpackgooglesignin.api.client

import android.util.Log
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackgooglesignin.api.model.Contacts
import com.example.jetpackgooglesignin.api.request.PeopleApiRequest
import com.example.jetpackgooglesignin.common.Constants.BASE_URL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    private val TAG = ApiClient::class.java.simpleName

    val api = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
        .create(PeopleApiRequest::class.java)

    fun getRequest(
        accessToken: String,
        success: (contacts: Contacts) -> Unit
    ) {
        try {
            GlobalScope.launch(Dispatchers.IO) {
                val response = api.getContacts(
                    "Bearer $accessToken",
                    "names,emailAddresses,photos"
                )
                response.body()?.let { success(it) }
            }
        } catch (error: Exception) {
            Log.e(TAG,"getRequest: failure: $error")
        }
    }

}