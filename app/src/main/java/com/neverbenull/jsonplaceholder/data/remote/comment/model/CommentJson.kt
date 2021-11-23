package com.neverbenull.jsonplaceholder.data.remote.comment.model

data class CommentJson(
    val id: Int,
    val postId: Int,
    val name: String?,
    val email: String?,
    val body: String?
)