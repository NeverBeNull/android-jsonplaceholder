package com.neverbenull.jsonplaceholder.di

import android.content.Context
import androidx.room.Room
import com.neverbenull.jsonplaceholder.data.local.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    private const val DB_NAME = "App.db"

    @Singleton
    @Provides
    fun provideAppDataBase(
        @ApplicationContext context: Context
    ) : AppDataBase {
        return Room.databaseBuilder(context, AppDataBase::class.java, DB_NAME)
            .build()
    }

}