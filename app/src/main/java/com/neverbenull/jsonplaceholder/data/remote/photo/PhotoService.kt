package com.neverbenull.jsonplaceholder.data.remote.photo

import com.neverbenull.jsonplaceholder.data.remote.photo.model.PhotoJson
import retrofit2.http.GET

interface PhotoService {

    @GET("/photos")
    suspend fun getPhotos() : List<PhotoJson>

}