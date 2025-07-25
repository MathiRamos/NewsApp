
package com.example.newsapp.util

import com.example.newsapp.data.local.FavoriteArticle
import com.example.newsapp.data.model.Article

fun FavoriteArticle.toArticle() = Article(
    title = this.title,
    author = this.author,
    urlToImage = this.urlToImage,
    content = this.content,
    url = this.url,
    description = this.description,
    publishedAt = this.publishedAt
)

fun Article.toFavoriteArticle() = FavoriteArticle(
    url = this.url ?: "",
    title = this.title,
    author = this.author,
    urlToImage = this.urlToImage,
    content = this.content,
    description = this.description,
    publishedAt = this.publishedAt
)

