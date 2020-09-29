package com.bwrsks.latihanretrofit

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("employee")
    fun getEmployee(): Call<ArrayList<PostResponse>>
}