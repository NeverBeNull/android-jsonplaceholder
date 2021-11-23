package com.neverbenull.jsonplaceholder.data.remote.user

import com.neverbenull.jsonplaceholder.data.remote.user.model.UserJson
import retrofit2.http.GET

interface UserService {

    @GET("/users")
    suspend fun getUsers() : List<UserJson>

}