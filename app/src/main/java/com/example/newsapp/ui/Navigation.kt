package com.example.newsapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.ui.detail.DetailScreen
import com.example.newsapp.ui.login.LoginScreen
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object Favorites : Screen("favorites")
    object Settings : Screen("settings")
    object Detail : Screen("detail/{articleUrl}") {
        fun createRoute(articleUrl: String) = "detail/$articleUrl"
    }
}

@Composable
fun AppNavigation(startDestination: String = Screen.Login.route) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        // Pantalla de Login
        composable(Screen.Login.route) {
            LoginScreen(onLoginSuccess = {
                navController.navigate("main") {
                    popUpTo(Screen.Login.route) { inclusive = true }
                }
            })
        }

        // Pantalla principal con barra de navegación inferior
        composable("main") {
            MainScreen(navController = navController)
        }

        // Pantalla de detalles de noticia
        composable(Screen.Detail.route) { backStackEntry ->
            val encodedUrl = backStackEntry.arguments?.getString("articleUrl") ?: ""
            val articleUrl = URLDecoder.decode(encodedUrl, StandardCharsets.UTF_8.toString())
            DetailScreen(articleUrl = articleUrl)
        }
    }
}
