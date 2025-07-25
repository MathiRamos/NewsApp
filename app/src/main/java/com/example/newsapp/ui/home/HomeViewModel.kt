package com.example.newsapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.BuildConfig
import com.example.newsapp.data.model.Article
import com.example.newsapp.data.repository.NewsRepository
import com.example.newsapp.util.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {

    private val _newsState = MutableStateFlow(HomeUiState())
    val newsState: StateFlow<HomeUiState> = _newsState

    init {
        getTopHeadlines()
    }

    fun getTopHeadlines() {
        fetchNews(null)
    }

    fun searchNews(query: String) {
        fetchNews(query)
    }

    private fun fetchNews(query: String?) {
        viewModelScope.launch {
            _newsState.value = _newsState.value.copy(isLoading = true)

            when (val response = repository.getNews(query, BuildConfig.NEWS_API_KEY)) {
                is NetworkResult.Success -> {
                    _newsState.value = HomeUiState(
                        articles = response.data ?: emptyList(),
                        isLoading = false
                    )
                }
                is NetworkResult.Error -> {
                    val userMessage = when {
                        response.message?.contains("Unable to resolve host") == true -> {
                            ""
                        }
                        else -> response.message ?: "Error desconocido."
                    }

                    _newsState.value = HomeUiState(
                        error = userMessage,
                        isLoading = false
                    )
                }
                is NetworkResult.Loading -> {
                    _newsState.value = HomeUiState(
                        isLoading = true
                    )
                }
            }
        }
    }

    data class HomeUiState(
        val articles: List<Article> = emptyList(),
        val isLoading: Boolean = false,
        val error: String? = null
    )
}
