package com.example.newsapp.di;

import com.example.newsapp.data.local.AppDatabase;
import com.example.newsapp.data.network.ApiService;
import com.example.newsapp.data.repository.NewsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideNewsRepositoryFactory implements Factory<NewsRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideNewsRepositoryFactory(Provider<ApiService> apiServiceProvider,
      Provider<AppDatabase> dbProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public NewsRepository get() {
    return provideNewsRepository(apiServiceProvider.get(), dbProvider.get());
  }

  public static AppModule_ProvideNewsRepositoryFactory create(
      Provider<ApiService> apiServiceProvider, Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideNewsRepositoryFactory(apiServiceProvider, dbProvider);
  }

  public static NewsRepository provideNewsRepository(ApiService apiService, AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsRepository(apiService, db));
  }
}
