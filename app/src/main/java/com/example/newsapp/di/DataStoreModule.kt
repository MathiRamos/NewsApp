package com.example.newsapp.di

import android.content.Context
import com.example.newsapp.data.preferences.ThemePreferenceManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {
    @Provides
    @Singleton
    fun provideThemePreferenceManager(@ApplicationContext context: Context): ThemePreferenceManager =
        ThemePreferenceManager(context)
}
