package com.neverbenull.jsonplaceholder.data.remote.photo.model

data class PhotoJson(
    val id: Int,
    val albumId: Int,
    val title: String?,
    val url: String?,
    val thumbnailUrl: String?
)