package com.neverbenull.jsonplaceholder.data.local.album

import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity
import com.neverbenull.jsonplaceholder.di.DataBaseModuleTest
import kotlinx.coroutines.runBlocking
import org.junit.Test

class AlbumDaoTest : DataBaseModuleTest() {

    @Test
    @Throws(Exception::class)
    fun getAlbums() = runBlocking {
        val mockAlbum = AlbumEntity(id = 1, userId = 1, title = "test origin")
        albumDao.insertAlbum(mockAlbum)

        val mockAlbums = (0..10).map { AlbumEntity(id = it, userId = it, title = "test $it") }
        albumDao.insertAlbums(mockAlbums)

        println(albumDao.getAlbums())
    }

}