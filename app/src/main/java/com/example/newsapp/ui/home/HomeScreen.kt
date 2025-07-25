package com.example.newsapp.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsapp.data.model.Article
import com.example.newsapp.ui.ArticleList
import com.example.newsapp.ui.LoadingIndicator
import com.example.newsapp.ui.components.ErrorMessage


@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    onArticleClick: (Article) -> Unit
) {
    val state by viewModel.newsState.collectAsState()
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = {
                searchQuery = it
                if (it.isBlank()) {
                    viewModel.getTopHeadlines()
                } else {
                    viewModel.searchNews(it)
                }
            },
            label = { Text("Buscar noticias...") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        when {
            state.isLoading -> {
                LoadingIndicator()
            }

            state.error != null -> {
                ErrorMessage(
                    message = state.error ?: "Error inesperado",
                    onRetry = { viewModel.getTopHeadlines() }
                )
            }

            state.articles.isEmpty() -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text("No se encontraron noticias.")
                }
            }

            else -> {
                ArticleList(
                    articles = state.articles,
                    onItemClick = onArticleClick
                )
            }
        }
    }
}
