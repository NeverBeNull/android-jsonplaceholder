package com.neverbenull.jsonplaceholder.data.remote

import com.neverbenull.jsonplaceholder.di.NetworkModule
import retrofit2.Retrofit

object NetworkModuleTest {

    val retrofit: Retrofit

    init {
        val okHttpClient = NetworkModule.provideOkHttpClient()
        retrofit = NetworkModule.provideRetrofit(okHttpClient)
    }
}