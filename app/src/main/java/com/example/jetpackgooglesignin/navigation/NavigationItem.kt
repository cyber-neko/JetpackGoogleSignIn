package com.example.jetpackgooglesignin.navigation

sealed class NavigationItem(val route: String, val title: String) {
    object Login : NavigationItem("login","Login")
    object Contacts : NavigationItem("contacts","Contacts")
}