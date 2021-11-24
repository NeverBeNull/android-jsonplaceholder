package com.neverbenull.jsonplaceholder.data.repository.album

import com.neverbenull.jsonplaceholder.domain.model.Album
import com.neverbenull.jsonplaceholder.domain.repository.album.AlbumRepository

class AlbumRepositoryImpl constructor(
    private val albumLocalDataSource: AlbumDataSource,
    private val albumRemoteDataSource: AlbumDataSource
) : AlbumRepository {

    override suspend fun getAlbums(): List<Album> {
        TODO("Not yet implemented")
    }

}