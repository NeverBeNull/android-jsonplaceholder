package com.neverbenull.jsonplaceholder.data.remote.todo

import com.neverbenull.jsonplaceholder.data.remote.NetworkModuleTest
import kotlinx.coroutines.runBlocking
import org.junit.Test

class TodoServiceTest {

    private val todoService = TodoModule.provideTodoService(NetworkModuleTest.retrofit)

    @Test
    fun `get todos` () {
        runBlocking {
            println(todoService.getTodos())
        }
    }

}