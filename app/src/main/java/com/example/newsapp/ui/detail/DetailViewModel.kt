package com.example.newsapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.data.local.FavoriteArticle
import com.example.newsapp.data.local.FavoriteArticleDao
import com.example.newsapp.data.model.Article
import com.example.newsapp.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
 private val repository: NewsRepository,
 private val dao: FavoriteArticleDao
) : ViewModel() {

 private val _article = MutableStateFlow<Article?>(null)
 val article: StateFlow<Article?> = _article.asStateFlow()

 private val _isFavorite = MutableStateFlow(false)
 val isFavorite: StateFlow<Boolean> = _isFavorite.asStateFlow()

 fun loadArticle(url: String) {
  viewModelScope.launch(Dispatchers.IO) {
   val allArticles = repository.getCachedArticles()
   val selected = allArticles.find { it.url == url }

   _article.value = selected
   checkIfFavorite(url)
  }
 }

 private fun checkIfFavorite(url: String) {
  viewModelScope.launch(Dispatchers.IO) {
   val exists = dao.exists(url)
   _isFavorite.value = exists
  }
 }

 fun addToFavorites(article: Article) {
  viewModelScope.launch(Dispatchers.IO) {
   dao.insert(article.toFavoriteEntity())
   _isFavorite.value = true
  }
 }

 fun removeFromFavorites(article: Article) {
  viewModelScope.launch(Dispatchers.IO) {
   dao.delete(article.toFavoriteEntity())
   _isFavorite.value = false
  }
 }

 private fun Article.toFavoriteEntity() = FavoriteArticle(
  url = this.url ?: "",
  title = this.title ?: "",
  author = this.author ?: "",
  urlToImage = this.urlToImage ?: "",
  content = this.content ?: "",
  description = this.description ?: "",
  publishedAt = this.publishedAt ?: ""
 )
}
