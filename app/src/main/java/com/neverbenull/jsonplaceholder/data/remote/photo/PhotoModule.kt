package com.neverbenull.jsonplaceholder.data.remote.photo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PhotoModule {

    @Singleton
    @Provides
    fun providePhotoService(
        retrofit: Retrofit
    ) : PhotoService {
        return retrofit.create(PhotoService::class.java)
    }

}