package com.pourkazemi.mahdi.myretrofit_quiz

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class MyInterceptor :Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val originRequest:Request=chain.request()
        val newRequest:Request=originRequest.newBuilder()
            .addHeader("Authorization","Bearer mahdipourkazemichange")
            .build()
        return chain.proceed(newRequest)
    }
}