package com.appfashion.app.data.remote

import com.appfashion.app.data.model.NewsList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("/")
    fun listnews() : Call<NewsList>

    @GET("detail/")
    fun detailNews(@Query("url") url: String): Call<NewsList>

    @GET("search/")
    fun searchNews(@Query("q") query: String) : Call<NewsList>
}