package com.neverbenull.jsonplaceholder.data.remote.todo.model

data class TodoJson(
    val id: Int,
    val userId: Int,
    val completed: Boolean,
    val title: String?
)