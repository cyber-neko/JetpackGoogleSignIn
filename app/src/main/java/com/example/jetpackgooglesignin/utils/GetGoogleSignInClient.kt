package com.example.jetpackgooglesignin.utils

import android.content.Context
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.Scope
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import java.util.*

fun getGoogleSignInClient(context: Context): GoogleSignInClient {
    val signInOption = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
        .requestScopes(Scope("https://mail.google.com/"))
        .requestId()
        .requestEmail()
        .build()

    return GoogleSignIn.getClient(context, signInOption)
}