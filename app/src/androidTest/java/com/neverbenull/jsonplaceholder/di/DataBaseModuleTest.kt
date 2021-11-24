package com.neverbenull.jsonplaceholder.di

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.neverbenull.jsonplaceholder.data.local.AppDataBase
import com.neverbenull.jsonplaceholder.data.local.album.AlbumDao
import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class DataBaseModuleTest {

    private lateinit var albumDao: AlbumDao
    private lateinit var database: AppDataBase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(context, AppDataBase::class.java).build()

        albumDao = database.albumDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        database.close()
    }

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