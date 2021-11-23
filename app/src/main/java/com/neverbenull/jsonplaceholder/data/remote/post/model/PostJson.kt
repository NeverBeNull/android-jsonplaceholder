package com.neverbenull.jsonplaceholder.data.remote.post.model

data class PostJson(
    val id: Int,
    val userId: Int,
    val body: String?,
    val title: String?
)