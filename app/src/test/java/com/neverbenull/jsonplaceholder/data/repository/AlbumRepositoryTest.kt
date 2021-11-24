package com.neverbenull.jsonplaceholder.data.repository

import com.neverbenull.jsonplaceholder.data.local.album.AlbumDao
import com.neverbenull.jsonplaceholder.data.local.album.MockAlbumDao
import com.neverbenull.jsonplaceholder.data.remote.album.model.AlbumJson
import com.neverbenull.jsonplaceholder.data.repository.album.AlbumMapper
import com.neverbenull.jsonplaceholder.data.repository.album.AlbumRepositoryImpl
import com.neverbenull.jsonplaceholder.di.NetworkModuleTest
import com.neverbenull.jsonplaceholder.di.data.AlbumModule
import com.neverbenull.jsonplaceholder.domain.repository.album.AlbumRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.junit.Before
import org.junit.Test

class AlbumRepositoryTest {

    private val albumService = AlbumModule.provideAlbumService(NetworkModuleTest.retrofit)
    private lateinit var mockAlbumDao : AlbumDao
    private lateinit var mockAlbumRepository : AlbumRepository

    @Before
    fun createRepository() {
        mockAlbumDao = MockAlbumDao()
        mockAlbumRepository = AlbumRepositoryImpl(mockAlbumDao, albumService)
    }

    @Test
    fun `get albums`() = runBlocking {
        val entityAlbums = mockAlbumDao.getAlbums()

        val albums = if(entityAlbums.isEmpty()) {
            println("entityAlbums is Empty")

            val jsonAlbums = albumService.getAlbums()
            insertAlbumsFromJson(jsonAlbums)
            jsonAlbums.map { AlbumMapper.jsonToDomainModel(it) }

        } else {
            println("entityAlbums is NotEmpty")

            entityAlbums.map { AlbumMapper.entityToDomainModel(it) }
        }

        println(albums)
    }

    private suspend fun insertAlbumsFromJson(
        jsonAlbums: List<AlbumJson>
    ) = withContext(Dispatchers.IO) {
        mockAlbumDao.insertAlbums(
            jsonAlbums.map { AlbumMapper.jsonToEntity(it) }
        )
    }
}