package com.pourkazemi.mahdi.myretrofit_quiz

import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object MyNetworkManager {
    var client = OkHttpClient.Builder().addInterceptor { chain ->
        val newRequest: Request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer bkjcsbmahdipourkazemi")
            .build()
        chain.proceed(newRequest)
    }.build()
    private val retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl("http://papp.ir/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val myService = retrofit.create(MyLoggingService::class.java)
}

