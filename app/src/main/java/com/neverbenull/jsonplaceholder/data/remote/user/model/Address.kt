package com.neverbenull.jsonplaceholder.data.remote.user.model

data class Address(
    val geo: Geo?,
    val city: String?,
    val street: String?,
    val suite: String?,
    val zipcode: String?
)