package com.neverbenull.jsonplaceholder.data.remote.comment

import com.neverbenull.jsonplaceholder.data.remote.NetworkModuleTest
import com.neverbenull.jsonplaceholder.di.data.CommentModule
import kotlinx.coroutines.runBlocking
import org.junit.Test

class CommentServiceTest {

    private val commentService = CommentModule.provideCommentService(NetworkModuleTest.retrofit)

    @Test
    fun `get comments` () {
        runBlocking {
            println(commentService.getComments())
        }
    }

}