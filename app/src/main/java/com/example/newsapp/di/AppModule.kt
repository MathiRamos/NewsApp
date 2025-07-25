package com.example.newsapp.di

import android.content.Context
import androidx.room.Room
import com.example.newsapp.data.local.AppDatabase
import com.example.newsapp.data.local.FavoriteArticleDao
import com.example.newsapp.data.network.ApiService
import com.example.newsapp.data.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = "https://newsapi.org/v2/"

    @Provides
    @Singleton
    fun provideRetrofit(BASE_URL: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "news_database"
        ).build()
    }

    @Provides
    fun provideFavoriteArticleDao(db: AppDatabase): FavoriteArticleDao {
        return db.favoriteArticleDao()
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        apiService: ApiService,
        db: AppDatabase
    ): NewsRepository {
        return NewsRepository(
            remoteDataSource = com.example.newsapp.data.datasource.NewsRemoteDataSource(apiService),
            localDataSource = com.example.newsapp.data.datasource.FavoritesLocalDataSource(db.favoriteArticleDao())
        )
    }
}
