package com.neverbenull.jsonplaceholder.data.remote.photo.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoJson(
    @Json(name = "id") val id: Int,
    @Json(name = "albumId") val albumId: Int,
    @Json(name = "title") val title: String?,
    @Json(name = "url") val url: String?,
    @Json(name = "thumbnailUrl") val thumbnailUrl: String?
)