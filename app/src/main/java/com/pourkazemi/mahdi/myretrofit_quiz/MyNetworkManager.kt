package com.pourkazemi.mahdi.myretrofit_quiz

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object MyNetworkManager {
    val logging = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }
    val mInterceptor=MyInterceptor()
    var client = OkHttpClient.Builder().addInterceptor(mInterceptor)
        .addInterceptor(logging)
            .build()
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://papp.ir/api/v1/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val myService = retrofit.create(MyLoggingService::class.java)
}

