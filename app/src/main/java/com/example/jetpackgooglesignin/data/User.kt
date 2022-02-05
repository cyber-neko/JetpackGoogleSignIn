package com.example.jetpackgooglesignin.data

import android.net.Uri

data class User(
    val email: String,
    val displayName: String,
    val avatar: Uri
)