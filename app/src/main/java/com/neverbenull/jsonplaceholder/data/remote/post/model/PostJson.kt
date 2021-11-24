package com.neverbenull.jsonplaceholder.data.remote.post.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostJson(
    @Json(name = "id") val id: Int,
    @Json(name = "userId") val userId: Int,
    @Json(name = "body") val body: String?,
    @Json(name = "title") val title: String?
)