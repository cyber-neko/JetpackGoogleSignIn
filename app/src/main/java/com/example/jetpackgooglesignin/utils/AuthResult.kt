package com.example.jetpackgooglesignin.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.activity.result.contract.ActivityResultContract
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.tasks.Task

class AuthResult: ActivityResultContract<Int, Task<GoogleSignInAccount>?>() {

    private val TAG = AuthResult::class.java.simpleName

    override fun createIntent(context: Context, input: Int): Intent =
        getGoogleSignInClient(context = context).signInIntent.putExtra("input", input)

    override fun parseResult(resultCode: Int, intent: Intent?): Task<GoogleSignInAccount>? {

        return when (resultCode) {
            Activity.RESULT_OK ->
                GoogleSignIn.getSignedInAccountFromIntent(intent)
            else ->
                null
        }
    }
}