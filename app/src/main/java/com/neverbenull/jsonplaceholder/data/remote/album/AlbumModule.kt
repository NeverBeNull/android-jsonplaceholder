package com.neverbenull.jsonplaceholder.data.remote.album

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
    fun provideAlbumService(
        retrofit: Retrofit
    ) : AlbumService {
        return retrofit.create(AlbumService::class.java)
    }

}