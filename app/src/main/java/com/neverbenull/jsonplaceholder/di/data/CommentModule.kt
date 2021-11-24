package com.neverbenull.jsonplaceholder.di.data

import com.neverbenull.jsonplaceholder.data.remote.comment.CommentService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CommentModule {

    @Singleton
    @Provides
    fun provideCommentService(
        retrofit: Retrofit
    ) : CommentService {
        return retrofit.create(CommentService::class.java)
    }

}