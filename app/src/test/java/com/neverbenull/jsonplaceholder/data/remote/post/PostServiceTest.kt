package com.neverbenull.jsonplaceholder.data.remote.post

import com.neverbenull.jsonplaceholder.data.remote.NetworkModuleTest
import com.neverbenull.jsonplaceholder.di.data.PostModule
import kotlinx.coroutines.runBlocking
import org.junit.Test

class PostServiceTest {

    private val postService = PostModule.providePostService(NetworkModuleTest.retrofit)

    @Test
    fun `get posts` () {
        runBlocking {
            println(postService.getPosts())
        }
    }

}