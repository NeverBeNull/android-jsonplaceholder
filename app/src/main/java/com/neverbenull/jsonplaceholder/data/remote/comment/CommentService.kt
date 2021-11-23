package com.neverbenull.jsonplaceholder.data.remote.comment

import com.neverbenull.jsonplaceholder.data.remote.comment.model.CommentJson
import retrofit2.http.GET

interface CommentService {

    @GET("/comments")
    suspend fun getComments() : List<CommentJson>

}