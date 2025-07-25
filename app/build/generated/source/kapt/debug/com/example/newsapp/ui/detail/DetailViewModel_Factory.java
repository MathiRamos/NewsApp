package com.example.newsapp.ui.detail;

import com.example.newsapp.data.local.FavoriteArticleDao;
import com.example.newsapp.data.repository.NewsRepository;
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
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<NewsRepository> repositoryProvider;

  private final Provider<FavoriteArticleDao> daoProvider;

  public DetailViewModel_Factory(Provider<NewsRepository> repositoryProvider,
      Provider<FavoriteArticleDao> daoProvider) {
    this.repositoryProvider = repositoryProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(repositoryProvider.get(), daoProvider.get());
  }

  public static DetailViewModel_Factory create(Provider<NewsRepository> repositoryProvider,
      Provider<FavoriteArticleDao> daoProvider) {
    return new DetailViewModel_Factory(repositoryProvider, daoProvider);
  }

  public static DetailViewModel newInstance(NewsRepository repository, FavoriteArticleDao dao) {
    return new DetailViewModel(repository, dao);
  }
}
