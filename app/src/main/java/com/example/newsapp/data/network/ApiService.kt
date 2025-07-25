package com.example.newsapp.data.network

import com.example.newsapp.data.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {


    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String = "mx",
        @Query("language") language: String = "es",
        @Query("category") category: String = "general",
        @Query("apiKey") apiKey: String
    ): Response<NewsResponse>

    @GET("everything")
    suspend fun searchNews(
        @Query("q") query: String,
        @Query("language") language: String = "es",
        @Query("sortBy") sortBy: String = "publishedAt",
        @Query("apiKey") apiKey: String
    ): Response<NewsResponse>
}
