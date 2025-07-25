package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.toArgb
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import com.example.newsapp.ui.MainScreen
import com.example.newsapp.ui.settings.SettingsViewModel
import com.example.newsapp.ui.theme.NewsAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val settingsViewModel: SettingsViewModel = hiltViewModel()
            val isDarkTheme by settingsViewModel.isDarkTheme.collectAsState()
            val navController = rememberNavController()
            val view = LocalView.current
            val window = window

            NewsAppTheme(darkTheme = isDarkTheme) {
                // Cambiar color de la barra de estado
                window.statusBarColor = MaterialTheme.colorScheme.primary.toArgb()
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !isDarkTheme

                Surface(color = MaterialTheme.colorScheme.background) {
                    MainScreen(navController = navController)
                }
            }
        }
    }
}
