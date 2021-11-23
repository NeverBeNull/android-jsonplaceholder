package com.neverbenull.jsonplaceholder.data.remote.album

import com.neverbenull.jsonplaceholder.data.remote.album.model.AlbumJson
import retrofit2.http.GET

interface AlbumService {

    @GET("/albums")
    suspend fun getAlbums() : List<AlbumJson>

}