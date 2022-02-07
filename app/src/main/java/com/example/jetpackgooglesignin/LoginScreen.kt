package com.example.jetpackgooglesignin

import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.jetpackgooglesignin.component.GoogleSignInButton
import com.example.jetpackgooglesignin.navigation.NavigationItem
import com.example.jetpackgooglesignin.viewmodel.MainViewModel
import com.google.android.gms.common.api.ApiException
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun LoginScreen(
    mainActivity: MainActivity,
    mainViewModel: MainViewModel,
    navController: NavController
) {

//    var isLoading by remember { mutableStateOf(false) }
//    val credential = GoogleCredential(mainActivity)
//    val TAG = "Sign in"
//
//    val authResultLauncher = rememberLauncherForActivityResult(
//        contract = AuthResultContract()
//    ) { task ->
//        try {
//            val account = task?.getResult(ApiException::class.java)
//            if (account == null) {
//                Log.d(TAG, "Google sign: account: null")
//            } else {
//                Log.d(TAG, "Google sign: done: ${account.account}")
//                credential.credential.setSelectedAccount(account?.account)
//
//                MainScope().launch {
//                    withContext(Dispatchers.Default) {
//                        try {
//                            account.displayName?.let { username ->
//                                account.email?.let { mailAddress ->
//                                    gmailChatViewModel.storeUserData(
//                                        name = username,
//                                        email = mailAddress,
//                                        avatar = account.photoUrl,
//                                        token = credential.credential.token
//                                    )
//                                }
//                            }
//                        } catch (e: Exception) {
//                            Log.e(TAG, "getProfileWithRetrofit(): failed")
//                        }
//                    }
//                }
//            }
//        } catch (e: ApiException) {
//            Log.d(TAG, "Google sign in: failed")
//        }
//    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GoogleSignInButton(
            text = "Googleでサインイン",
            icon = painterResource(id = R.drawable.logo_google),
            loadingText = "Signing In...",
            isLoading = isLoading,
            onClick = {
                isLoading = true
                navController.navigate(NavigationItem.Contacts.route)
//                authResultLauncher.launch(credential.signInRequestCode)
            }
        )

    }
}