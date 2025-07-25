package com.example.newsapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<String> bASE_URLProvider;

  public AppModule_ProvideRetrofitFactory(Provider<String> bASE_URLProvider) {
    this.bASE_URLProvider = bASE_URLProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(bASE_URLProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(Provider<String> bASE_URLProvider) {
    return new AppModule_ProvideRetrofitFactory(bASE_URLProvider);
  }

  public static Retrofit provideRetrofit(String BASE_URL) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofit(BASE_URL));
  }
}
