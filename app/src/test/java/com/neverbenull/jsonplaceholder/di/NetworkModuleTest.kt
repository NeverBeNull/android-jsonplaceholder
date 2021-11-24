package com.neverbenull.jsonplaceholder.di

import retrofit2.Retrofit

object NetworkModuleTest {

    val retrofit: Retrofit

    init {
        val okHttpClient = NetworkModule.provideOkHttpClient()
        retrofit = NetworkModule.provideRetrofit(okHttpClient)
    }
}