package com.example.newsapp.ui.favorites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.data.model.Article
import com.example.newsapp.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(
 private val repository: NewsRepository
) : ViewModel() {

 val favorites = repository.getAllFavoritesFlow()
  .stateIn(
   scope = viewModelScope,
   started = SharingStarted.Lazily,
   initialValue = emptyList()
  )

 fun removeFavorite(article: Article) {
  viewModelScope.launch {
   repository.deleteFavorite(article)
  }
 }

 fun addFavorite(article: Article) {
  viewModelScope.launch {
   repository.insertFavorite(article)
  }
 }
}
