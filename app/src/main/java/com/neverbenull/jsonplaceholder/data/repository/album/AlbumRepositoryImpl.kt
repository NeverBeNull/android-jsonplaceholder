package com.neverbenull.jsonplaceholder.data.repository.album

import com.neverbenull.jsonplaceholder.data.local.album.AlbumDao
import com.neverbenull.jsonplaceholder.data.remote.album.AlbumService
import com.neverbenull.jsonplaceholder.domain.model.Album
import com.neverbenull.jsonplaceholder.domain.repository.album.AlbumRepository
import javax.inject.Inject

class AlbumRepositoryImpl @Inject constructor(
    private val albumDao: AlbumDao,
    private val albumService: AlbumService
) : AlbumRepository {

    override suspend fun getAlbums(): List<Album> {
        TODO("Not yet implemented")
    }

}