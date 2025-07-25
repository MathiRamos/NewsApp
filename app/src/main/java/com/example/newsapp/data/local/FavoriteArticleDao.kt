package com.example.newsapp.data.local

import androidx.room.*

@Dao
interface FavoriteArticleDao {

 @Insert(onConflict = OnConflictStrategy.REPLACE)
 suspend fun insert(article: FavoriteArticle)

 @Delete
 suspend fun delete(article: FavoriteArticle)

 @Query("SELECT EXISTS(SELECT 1 FROM favorites WHERE url = :url)")
 suspend fun exists(url: String): Boolean

 @Query("SELECT * FROM favorites")
 fun getAllFlow(): kotlinx.coroutines.flow.Flow<List<FavoriteArticle>>

 @Query("SELECT * FROM favorites WHERE url = :url LIMIT 1")
 suspend fun getByUrl(url: String): FavoriteArticle?

}

