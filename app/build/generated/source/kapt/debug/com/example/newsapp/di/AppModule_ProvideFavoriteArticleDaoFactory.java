package com.example.newsapp.di;

import com.example.newsapp.data.local.AppDatabase;
import com.example.newsapp.data.local.FavoriteArticleDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideFavoriteArticleDaoFactory implements Factory<FavoriteArticleDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideFavoriteArticleDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FavoriteArticleDao get() {
    return provideFavoriteArticleDao(dbProvider.get());
  }

  public static AppModule_ProvideFavoriteArticleDaoFactory create(
      Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideFavoriteArticleDaoFactory(dbProvider);
  }

  public static FavoriteArticleDao provideFavoriteArticleDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFavoriteArticleDao(db));
  }
}
