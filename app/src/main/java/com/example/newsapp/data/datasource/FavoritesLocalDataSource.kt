package com.example.newsapp.data.datasource

import com.example.newsapp.data.local.FavoriteArticle
import com.example.newsapp.data.local.FavoriteArticleDao
import javax.inject.Inject

class FavoritesLocalDataSource @Inject constructor(
 private val dao: FavoriteArticleDao
) {
 suspend fun insertFavorite(article: FavoriteArticle) = dao.insert(article)
 suspend fun deleteFavorite(article: FavoriteArticle) = dao.delete(article)
 fun getAllFavoritesFlow() = dao.getAllFlow()
 suspend fun getFavoriteByUrl(url: String): FavoriteArticle? = dao.getByUrl(url)

}
