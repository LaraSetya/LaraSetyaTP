package com.appfashion.app.data.model

data class NewsList (
    val data : List<News> = arrayListOf(),
    val lenght :Int = 0,
    val status : Int = 0
)