package com.example.newsapp.data.repository

import com.example.newsapp.data.datasource.FavoritesLocalDataSource
import com.example.newsapp.data.datasource.NewsRemoteDataSource
import com.example.newsapp.data.model.Article
import com.example.newsapp.util.NetworkResult
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import com.example.newsapp.util.toArticle
import com.example.newsapp.util.toFavoriteArticle

class NewsRepository @Inject constructor(
 private val remoteDataSource: NewsRemoteDataSource,
 private val localDataSource: FavoritesLocalDataSource
) {
 private var cachedArticles: List<Article> = emptyList()

 suspend fun getNews(query: String?, apiKey: String): NetworkResult<List<Article>> {
  return try {
   val response = remoteDataSource.getNews(query, apiKey)
   if (response.isSuccessful && response.body() != null) {
    val articles = response.body()!!.articles
    cachedArticles = articles
    NetworkResult.Success(articles)
   } else {
    NetworkResult.Error("Error: ${response.message()}")
   }
  } catch (e: Exception) {
   NetworkResult.Error("Exception: ${e.message}")
  }
 }

 fun getCachedArticles(): List<Article> = cachedArticles

 fun getAllFavoritesFlow() = localDataSource.getAllFavoritesFlow()
  .map { list -> list.map { it.toArticle() } }

 suspend fun getFavoriteByUrl(url: String): Article? {
  return localDataSource.getFavoriteByUrl(url)?.toArticle()
 }

 suspend fun insertFavorite(article: Article) {
  localDataSource.insertFavorite(article.toFavoriteArticle())
 }

 suspend fun deleteFavorite(article: Article) {
  localDataSource.deleteFavorite(article.toFavoriteArticle())
 }
}
