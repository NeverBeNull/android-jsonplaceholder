package com.neverbenull.jsonplaceholder.data.local.album

import com.neverbenull.jsonplaceholder.data.datasource.album.AlbumDataSource
import com.neverbenull.jsonplaceholder.domain.model.Album

class AlbumLocalDataSource constructor(
    private val albumDao: AlbumDao
): AlbumDataSource {

    override suspend fun getAlbums(): List<Album> {
        TODO("Not yet implemented")
    }

}