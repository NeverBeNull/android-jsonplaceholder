package com.neverbenull.jsonplaceholder.data.local.album

import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity
import kotlinx.coroutines.runBlocking
import org.junit.Test

class MockAlbumDao : AlbumDao {

    private val mockAlbumTable = mutableListOf<AlbumEntity>()

    init {
        mockAlbumTable.add(AlbumEntity(id = 1, userId = 1, title = "title 1"))
        mockAlbumTable.add(AlbumEntity(id = 2, userId = 2, title = "title 2"))
        mockAlbumTable.add(AlbumEntity(id = 3, userId = 3, title = "title 3"))
        mockAlbumTable.add(AlbumEntity(id = 4, userId = 4, title = "title 4"))
        mockAlbumTable.add(AlbumEntity(id = 5, userId = 5, title = "title 5"))
    }

    override suspend fun getAlbums() : List<AlbumEntity> {
        return mockAlbumTable
    }

    override suspend fun insertAlbums(albumList: List<AlbumEntity>) {
        mockAlbumTable.addAll(albumList)
    }

    override suspend fun insertAlbum(album: AlbumEntity) {
        mockAlbumTable.add(album)
    }

    @Test
    fun `get albums`() = runBlocking {
        println(getAlbums())
    }
}