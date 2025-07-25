package com.example.newsapp.data.repository;

import com.example.newsapp.data.datasource.FavoritesLocalDataSource;
import com.example.newsapp.data.datasource.NewsRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NewsRepository_Factory implements Factory<NewsRepository> {
  private final Provider<NewsRemoteDataSource> remoteDataSourceProvider;

  private final Provider<FavoritesLocalDataSource> localDataSourceProvider;

  public NewsRepository_Factory(Provider<NewsRemoteDataSource> remoteDataSourceProvider,
      Provider<FavoritesLocalDataSource> localDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public NewsRepository get() {
    return newInstance(remoteDataSourceProvider.get(), localDataSourceProvider.get());
  }

  public static NewsRepository_Factory create(
      Provider<NewsRemoteDataSource> remoteDataSourceProvider,
      Provider<FavoritesLocalDataSource> localDataSourceProvider) {
    return new NewsRepository_Factory(remoteDataSourceProvider, localDataSourceProvider);
  }

  public static NewsRepository newInstance(NewsRemoteDataSource remoteDataSource,
      FavoritesLocalDataSource localDataSource) {
    return new NewsRepository(remoteDataSource, localDataSource);
  }
}
