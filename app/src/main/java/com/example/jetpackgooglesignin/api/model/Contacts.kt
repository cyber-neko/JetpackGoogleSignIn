package com.example.jetpackgooglesignin.api.model

data class Contacts (
    val connections: List<Person>
)

data class Person(
    val names: List<Name>,
    val emailAddresses: List<EmailAddress>,
    val photos: List<Photo>
)

data class Name(
    val displayName: String
)

data class EmailAddress(
    val value: String
)

data class Photo(
    val url: String
)