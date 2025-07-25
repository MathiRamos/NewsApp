package com.example.newsapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteArticle(
    @PrimaryKey val url: String,
    val title: String?,
    val author: String?,
    val urlToImage: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?
)
