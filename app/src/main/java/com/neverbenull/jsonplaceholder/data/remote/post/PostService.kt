package com.neverbenull.jsonplaceholder.data.remote.post

import com.neverbenull.jsonplaceholder.data.remote.post.model.PostJson
import retrofit2.http.GET

interface PostService {

    @GET("/posts")
    suspend fun getPosts() : List<PostJson>

}