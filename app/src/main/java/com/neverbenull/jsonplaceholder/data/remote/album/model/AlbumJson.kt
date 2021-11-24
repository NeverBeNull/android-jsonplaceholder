package com.neverbenull.jsonplaceholder.data.remote.album.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AlbumJson(
    @Json(name = "id") val id: Int,
    @Json(name = "userId") val userId: Int,
    @Json(name = "title") val title: String?
)