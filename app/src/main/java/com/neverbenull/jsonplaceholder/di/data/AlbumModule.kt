package com.neverbenull.jsonplaceholder.di.data

import com.neverbenull.jsonplaceholder.data.datasource.album.AlbumDataSource
import com.neverbenull.jsonplaceholder.data.local.AppDataBase
import com.neverbenull.jsonplaceholder.data.local.album.AlbumDao
import com.neverbenull.jsonplaceholder.data.local.album.AlbumLocalDataSource
import com.neverbenull.jsonplaceholder.data.remote.album.AlbumRemoteDataSource
import com.neverbenull.jsonplaceholder.data.remote.album.AlbumService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AlbumModule {

    @Singleton
    @Provides
    fun provideAlbumDao(
        database: AppDataBase
    ) : AlbumDao {
        return database.albumDao()
    }

    @Singleton
    @Provides
    fun provideAlbumService(
        retrofit: Retrofit
    ) : AlbumService {
        return retrofit.create(AlbumService::class.java)
    }

    @Singleton
    @Provides
    fun provideAlbumLocalDataSource(
        albumDao: AlbumDao
    ) : AlbumDataSource {
        return AlbumLocalDataSource(albumDao)
    }

    @Singleton
    @Provides
    fun provideAlbumRemoteDataSource(
        albumService: AlbumService
    ) : AlbumDataSource {
        return AlbumRemoteDataSource(albumService)
    }

}