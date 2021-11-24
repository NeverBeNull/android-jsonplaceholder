package com.neverbenull.jsonplaceholder.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.neverbenull.jsonplaceholder.data.local.album.AlbumDao
import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity

@Database(entities = [AlbumEntity::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun albumDao() : AlbumDao

}