package com.example.newsapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.newsapp.data.model.Article

@Composable
fun LoadingIndicator() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun ErrorMessage(message: String, onRetry: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable { onRetry() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Error: $message\nToca para reintentar")
    }
}

@Composable
fun ArticleList(
    articles: List<Article>,
    onItemClick: (Article) -> Unit,
    onDeleteClick: ((Article) -> Unit)? = null
) {
    LazyColumn {
        items(articles) { article ->
            ArticleItem(
                article = article,
                onClick = { onItemClick(article) },
                onDeleteClick = onDeleteClick?.let { { it(article) } }
            )
        }
    }
}

@Composable
fun ArticleItem(
    article: Article,
    onClick: () -> Unit,
    onDeleteClick: (() -> Unit)? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = rememberAsyncImagePainter(article.urlToImage),
            contentDescription = article.title,
            modifier = Modifier.size(80.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = article.title ?: "", fontWeight = FontWeight.Bold)
            Text(text = article.description ?: "")
        }
        if (onDeleteClick != null) {
            IconButton(onClick = onDeleteClick) {
                Icon(Icons.Default.Delete, contentDescription = "Eliminar favorito")
            }
        }
    }
}
