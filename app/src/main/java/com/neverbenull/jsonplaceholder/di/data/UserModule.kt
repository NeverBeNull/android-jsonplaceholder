package com.neverbenull.jsonplaceholder.di.data

import com.neverbenull.jsonplaceholder.data.remote.user.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UserModule {

    @Singleton
    @Provides
    fun provideUserService(
        retrofit: Retrofit
    ) : UserService {
        return retrofit.create(UserService::class.java)
    }

}