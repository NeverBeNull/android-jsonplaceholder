package com.neverbenull.jsonplaceholder.data.remote.todo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoModule {

    @Singleton
    @Provides
    fun provideTodoService(
        retrofit: Retrofit
    ) : TodoService {
        return retrofit.create(TodoService::class.java)
    }

}