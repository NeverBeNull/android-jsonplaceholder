package com.neverbenull.jsonplaceholder.data.local.album

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.neverbenull.jsonplaceholder.data.local.album.model.AlbumEntity

@Dao
interface AlbumDao {

    @Query("SELECT * FROM Albums")
    suspend fun getAlbums() : List<AlbumEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAlbums(albumList: List<AlbumEntity>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAlbum(album: AlbumEntity)

}