package com.example.newsapp.ui.favorites

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsapp.data.model.Article
import com.example.newsapp.ui.ArticleList

@Composable
fun FavoritesScreen(
    viewModel: FavoritesViewModel = hiltViewModel(),
    onArticleClick: (Article) -> Unit
) {
    val favorites by viewModel.favorites.collectAsState()

    if (favorites.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("No tienes artículos guardados")
        }
    } else {
        ArticleList(
            articles = favorites,
            onItemClick = onArticleClick,
            onDeleteClick = { article -> viewModel.removeFavorite(article) }
        )
    }
}

