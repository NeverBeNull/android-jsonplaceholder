package com.neverbenull.jsonplaceholder.data.remote

import retrofit2.Retrofit

object NetworkModuleTest {

    val retrofit: Retrofit

    init {
        val okHttpClient = NetworkModule.provideOkHttpClient()
        retrofit = NetworkModule.provideRetrofit(okHttpClient)
    }
}