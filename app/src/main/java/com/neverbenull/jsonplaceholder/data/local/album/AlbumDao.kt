package com.neverbenull.jsonplaceholder.data.local.album

import androidx.room.Dao
import androidx.room.Query
import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity

@Dao
interface AlbumDao {

    @Query("SELECT * FROM Albums")
    suspend fun getAlbums() : List<AlbumEntity>

}