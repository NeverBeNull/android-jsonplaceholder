package com.neverbenull.jsonplaceholder.data.remote.todo

import com.neverbenull.jsonplaceholder.data.remote.todo.model.TodoJson
import retrofit2.http.GET

interface TodoService {

    @GET("/todos")
    suspend fun getTodos() : List<TodoJson>

}