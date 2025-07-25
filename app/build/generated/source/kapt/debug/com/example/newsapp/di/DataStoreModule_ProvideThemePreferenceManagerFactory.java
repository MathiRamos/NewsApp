package com.example.newsapp.di;

import android.content.Context;
import com.example.newsapp.data.preferences.ThemePreferenceManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DataStoreModule_ProvideThemePreferenceManagerFactory implements Factory<ThemePreferenceManager> {
  private final Provider<Context> contextProvider;

  public DataStoreModule_ProvideThemePreferenceManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ThemePreferenceManager get() {
    return provideThemePreferenceManager(contextProvider.get());
  }

  public static DataStoreModule_ProvideThemePreferenceManagerFactory create(
      Provider<Context> contextProvider) {
    return new DataStoreModule_ProvideThemePreferenceManagerFactory(contextProvider);
  }

  public static ThemePreferenceManager provideThemePreferenceManager(Context context) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.provideThemePreferenceManager(context));
  }
}
