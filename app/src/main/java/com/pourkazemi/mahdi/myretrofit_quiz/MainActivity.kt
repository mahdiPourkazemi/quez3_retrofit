package com.pourkazemi.mahdi.myretrofit_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
private val Tag="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mData=SignUpRequest("mahdi","pourkazemi","43265490467",
            listOf("movies","game"))
        val request_body=MyNetworkManager.myService.createAccount(mData)

        request_body.enqueue(object : Callback<String> {
            override fun onResponse(
                call: Call<String>,
                response: Response<String>
            ) {
                Log.d(Tag,response.body().toString())
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.d(Tag," post fail")
            }
        })
    }
}