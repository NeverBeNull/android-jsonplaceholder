package com.neverbenull.jsonplaceholder.data.remote.user.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Address(
    @Json(name = "geo") val geo: Geo?,
    @Json(name = "city") val city: String?,
    @Json(name = "street") val street: String?,
    @Json(name = "suite") val suite: String?,
    @Json(name = "zipcode") val zipcode: String?
)