package com.example.newsapp.ui.detail

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.newsapp.ui.LoadingIndicator

@Composable
fun DetailScreen(
    articleUrl: String,
    viewModel: DetailViewModel = hiltViewModel()
) {
    val article by viewModel.article.collectAsState()
    val isFavorite by viewModel.isFavorite.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(articleUrl) {
        viewModel.loadArticle(articleUrl)
    }

    if (article == null) {
        LoadingIndicator()
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    article!!.title ?: "Sin título",
                    style = MaterialTheme.typography.headlineSmall
                )

                Spacer(modifier = Modifier.height(8.dp))

                AsyncImage(
                    model = article!!.urlToImage,
                    contentDescription = article!!.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = article!!.description ?: "",
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = article!!.content ?: "Contenido completo no disponible"
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = {
                    if (isFavorite)
                        viewModel.removeFromFavorites(article!!)
                    else
                        viewModel.addToFavorites(article!!)
                }) {
                    Text(if (isFavorite) "Eliminar de favoritos" else "Guardar como favorito")
                }
            }

            Button(
                onClick = {
                    val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse(article!!.url))
                    context.startActivity(urlIntent)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Text("Leer noticia completa")
            }
        }
    }
}

