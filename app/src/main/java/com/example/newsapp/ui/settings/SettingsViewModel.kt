package com.example.newsapp.ui.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.data.preferences.ThemePreferenceManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
 private val themePreferenceManager: ThemePreferenceManager
) : ViewModel() {

 private val _isDarkTheme = MutableStateFlow(false)
 val isDarkTheme: StateFlow<Boolean> = _isDarkTheme

 init {
  themePreferenceManager.isDarkThemeFlow
   .onEach { savedTheme -> _isDarkTheme.value = savedTheme }
   .launchIn(viewModelScope)
 }

 fun toggleTheme() {
  val newTheme = !_isDarkTheme.value
  _isDarkTheme.value = newTheme
  viewModelScope.launch {
   themePreferenceManager.saveDarkTheme(newTheme)
  }
 }
}

