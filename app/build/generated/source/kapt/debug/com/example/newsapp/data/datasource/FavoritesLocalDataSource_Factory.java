package com.example.newsapp.data.datasource;

import com.example.newsapp.data.local.FavoriteArticleDao;
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
public final class FavoritesLocalDataSource_Factory implements Factory<FavoritesLocalDataSource> {
  private final Provider<FavoriteArticleDao> daoProvider;

  public FavoritesLocalDataSource_Factory(Provider<FavoriteArticleDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public FavoritesLocalDataSource get() {
    return newInstance(daoProvider.get());
  }

  public static FavoritesLocalDataSource_Factory create(Provider<FavoriteArticleDao> daoProvider) {
    return new FavoritesLocalDataSource_Factory(daoProvider);
  }

  public static FavoritesLocalDataSource newInstance(FavoriteArticleDao dao) {
    return new FavoritesLocalDataSource(dao);
  }
}
