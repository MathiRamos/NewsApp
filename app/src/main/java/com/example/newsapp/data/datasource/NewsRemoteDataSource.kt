package com.example.newsapp.data.datasource

import com.example.newsapp.data.network.ApiService
import javax.inject.Inject

class NewsRemoteDataSource @Inject constructor(
 private val apiService: ApiService
) {
 suspend fun getNews(query: String?, apiKey: String) =
  apiService.searchNews(
   query = query?.takeIf { it.isNotBlank() } ?: "noticias",
   language = "es",
   sortBy = "publishedAt",
   apiKey = apiKey
  )
}
