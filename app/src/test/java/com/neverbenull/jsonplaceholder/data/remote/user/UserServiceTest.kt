package com.neverbenull.jsonplaceholder.data.remote.user

import com.neverbenull.jsonplaceholder.data.remote.NetworkModuleTest
import kotlinx.coroutines.runBlocking
import org.junit.Test

class UserServiceTest {

    private val userService = UserModule.provideUserService(NetworkModuleTest.retrofit)

    @Test
    fun `get users` () {
        runBlocking {
            println(userService.getUsers())
        }
    }

}