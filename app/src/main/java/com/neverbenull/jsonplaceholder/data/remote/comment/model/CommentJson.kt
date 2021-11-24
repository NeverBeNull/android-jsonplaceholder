package com.neverbenull.jsonplaceholder.data.remote.comment.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentJson(
    @Json(name = "id") val id: Int,
    @Json(name = "postId") val postId: Int,
    @Json(name = "name") val name: String?,
    @Json(name = "email") val email: String?,
    @Json(name = "body") val body: String?
)