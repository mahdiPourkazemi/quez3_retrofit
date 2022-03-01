package com.pourkazemi.mahdi.myretrofit_quiz

data class SignUpRequest(
    val firstName: String,

    val lastName: String,
    val nationalCode: String,
    val hobbies: List<String>
)