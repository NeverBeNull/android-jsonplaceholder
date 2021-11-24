package com.neverbenull.jsonplaceholder.domain.repository.album

import com.neverbenull.jsonplaceholder.domain.model.Album

interface AlbumRepository {

    suspend fun getAlbums() : List<Album>

}