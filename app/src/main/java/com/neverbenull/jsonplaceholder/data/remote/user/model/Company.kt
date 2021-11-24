package com.neverbenull.jsonplaceholder.data.remote.user.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Company(
    @Json(name = "name") val name: String,
    @Json(name = "bs") val bs: String?,
    @Json(name = "catchPhrase") val catchPhrase: String?
)