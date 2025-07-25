package com.example.newsapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.newsapp.ui.components.BottomNavigationBar
import com.example.newsapp.ui.detail.DetailScreen
import com.example.newsapp.ui.favorites.FavoritesScreen
import com.example.newsapp.ui.home.HomeScreen
import com.example.newsapp.ui.login.LoginScreen
import com.example.newsapp.ui.settings.SettingsScreen
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun MainScreen(navController: NavHostController) {
    val bottomNavRoutes = listOf(Screen.Home.route, Screen.Favorites.route, Screen.Settings.route)

    // Obtenemos la ruta actual para saber si mostrar BottomNavigationBar
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute in bottomNavRoutes) {
                BottomNavigationBar(navController)
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Login.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            // Pantalla de Login
            composable(Screen.Login.route) {
                LoginScreen(onLoginSuccess = {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                })
            }

            // Pantalla Home
            composable(Screen.Home.route) {
                HomeScreen(onArticleClick = { article ->
                    article.url?.let { url ->
                        val encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
                        navController.navigate(Screen.Detail.createRoute(encodedUrl))
                    }
                })
            }

            // Pantalla Favoritos
            composable(Screen.Favorites.route) {
                FavoritesScreen(onArticleClick = { article ->
                    article.url?.let { url ->
                        val encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
                        navController.navigate(Screen.Detail.createRoute(encodedUrl))
                    }
                })
            }

            // Pantalla Configuración
            composable(Screen.Settings.route) {
                SettingsScreen(onLogout = {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(0) { inclusive = true }
                    }
                })
            }

            // Pantalla Detalle con parámetro articleUrl
            composable(Screen.Detail.route) { backStackEntry ->
                val encodedUrl = backStackEntry.arguments?.getString("articleUrl") ?: ""
                val articleUrl = URLDecoder.decode(encodedUrl, StandardCharsets.UTF_8.toString())
                DetailScreen(articleUrl = articleUrl)
            }
        }
    }
}
