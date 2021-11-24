package com.neverbenull.jsonplaceholder.data.datasource.album

import com.neverbenull.jsonplaceholder.domain.model.Album

interface AlbumDataSource {

    suspend fun getAlbums() : List<Album>

}