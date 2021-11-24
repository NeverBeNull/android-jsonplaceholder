package com.neverbenull.jsonplaceholder.data.remote.todo.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TodoJson(
    @Json(name = "id") val id: Int,
    @Json(name = "userId") val userId: Int,
    @Json(name = "completed") val completed: Boolean,
    @Json(name = "title") val title: String?
)