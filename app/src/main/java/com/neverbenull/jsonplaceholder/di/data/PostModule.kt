package com.neverbenull.jsonplaceholder.di.data

import com.neverbenull.jsonplaceholder.data.remote.post.PostService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PostModule {

    @Singleton
    @Provides
    fun providePostService(
        retrofit: Retrofit
    ) : PostService {
        return retrofit.create(PostService::class.java)
    }

}