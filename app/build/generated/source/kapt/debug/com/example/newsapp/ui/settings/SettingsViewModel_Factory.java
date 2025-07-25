package com.example.newsapp.ui.settings;

import com.example.newsapp.data.preferences.ThemePreferenceManager;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<ThemePreferenceManager> themePreferenceManagerProvider;

  public SettingsViewModel_Factory(
      Provider<ThemePreferenceManager> themePreferenceManagerProvider) {
    this.themePreferenceManagerProvider = themePreferenceManagerProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(themePreferenceManagerProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<ThemePreferenceManager> themePreferenceManagerProvider) {
    return new SettingsViewModel_Factory(themePreferenceManagerProvider);
  }

  public static SettingsViewModel newInstance(ThemePreferenceManager themePreferenceManager) {
    return new SettingsViewModel(themePreferenceManager);
  }
}
