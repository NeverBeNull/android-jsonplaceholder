package com.neverbenull.jsonplaceholder.data.repository.album

import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity
import com.neverbenull.jsonplaceholder.data.remote.album.model.AlbumJson
import com.neverbenull.jsonplaceholder.domain.model.Album

object AlbumMapper {

    fun entityToDomainModel(albumEntity: AlbumEntity) : Album {
        return with(albumEntity) {
            Album(
                id = id,
                userId = userId,
                title = title
            )
        }
    }

    fun jsonToDomainModel(albumJson: AlbumJson) : Album {
        return with(albumJson) {
            Album(
                id = id,
                userId = userId,
                title = title
            )
        }
    }

    fun jsonToEntity(albumJson: AlbumJson) : AlbumEntity {
        return with(albumJson) {
            AlbumEntity(
                id = id,
                userId = userId,
                title = title
            )
        }
    }

}