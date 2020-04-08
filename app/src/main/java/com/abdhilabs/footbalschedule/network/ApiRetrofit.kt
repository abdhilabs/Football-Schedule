package com.abdhilabs.footbalschedule.network

import com.abdhilabs.footbalschedule.BuildConfig
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiRetrofit {

    private fun createRetro(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(getHttpClient())
            .build()

    }

    fun <T> createService(service: Class<T>): T {
        return createRetro().create(service)
    }

    private fun getHttpClient(): OkHttpClient {
        val defaulTimeOut = 30L
        return OkHttpClient.Builder()
            .connectTimeout(defaulTimeOut, TimeUnit.SECONDS)
            .writeTimeout(defaulTimeOut, TimeUnit.SECONDS)
            .readTimeout(defaulTimeOut, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }
}