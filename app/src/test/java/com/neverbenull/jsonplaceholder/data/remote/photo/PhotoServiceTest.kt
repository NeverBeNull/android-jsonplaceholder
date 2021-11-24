package com.neverbenull.jsonplaceholder.data.remote.photo

import com.neverbenull.jsonplaceholder.di.NetworkModuleTest
import com.neverbenull.jsonplaceholder.di.data.PhotoModule
import kotlinx.coroutines.runBlocking
import org.junit.Test

class PhotoServiceTest {

    private val photoService = PhotoModule.providePhotoService(NetworkModuleTest.retrofit)

    @Test
    fun `get photos` () = runBlocking {
        println(photoService.getPhotos())
    }

}