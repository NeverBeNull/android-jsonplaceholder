package com.neverbenull.jsonplaceholder.data.remote.photo

import com.neverbenull.jsonplaceholder.data.remote.NetworkModuleTest
import kotlinx.coroutines.runBlocking
import org.junit.Test

class PhotoServiceTest {

    private val photoService = PhotoModule.providePhotoService(NetworkModuleTest.retrofit)

    @Test
    fun `get photos` () {
        runBlocking {
            println(photoService.getPhotos())
        }
    }

}