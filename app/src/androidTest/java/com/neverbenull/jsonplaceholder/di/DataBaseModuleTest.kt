package com.neverbenull.jsonplaceholder.di

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.neverbenull.jsonplaceholder.data.local.AppDataBase
import com.neverbenull.jsonplaceholder.data.local.album.AlbumDao
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
open class DataBaseModuleTest {

    protected lateinit var albumDao: AlbumDao
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

}