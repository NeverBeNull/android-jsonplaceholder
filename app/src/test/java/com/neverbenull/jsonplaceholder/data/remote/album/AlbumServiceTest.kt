package com.neverbenull.jsonplaceholder.data.remote.album

import com.neverbenull.jsonplaceholder.di.NetworkModuleTest
import com.neverbenull.jsonplaceholder.di.data.AlbumModule
import kotlinx.coroutines.runBlocking
import org.junit.Test

class AlbumServiceTest {

    private val albumService = AlbumModule.provideAlbumService(NetworkModuleTest.retrofit)

    @Test
    fun `get albums` () = runBlocking {
        println(albumService.getAlbums())
    }

}