package com.pourkazemi.mahdi.myretrofit_quiz

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface MyLoggingService {

        @POST()
        fun createAccount(@Body request: SignUpRequest): Call<String>
}