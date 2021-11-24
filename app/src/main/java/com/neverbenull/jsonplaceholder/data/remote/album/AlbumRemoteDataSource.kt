package com.neverbenull.jsonplaceholder.data.remote.album

import com.neverbenull.jsonplaceholder.data.repository.album.AlbumDataSource
import com.neverbenull.jsonplaceholder.domain.model.Album

class AlbumRemoteDataSource constructor(
    private val albumService: AlbumService
): AlbumDataSource {

    override suspend fun getAlbums(): List<Album> {
        TODO("Not yet implemented")
    }

}