package com.lubnamariyam.lykup.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lubnamariyam.lykup.ui.view.HomeScreen
import com.lubnamariyam.lykup.ui.view.SplashScreen

@Composable
fun NavGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable("splash_screen"){
            SplashScreen(navController)
        }
        composable("home_screen"){
            HomeScreen(navController = navController)
        }
        composable("product_list_screen"){

        }
        composable("product_detail_screen"){

        }
        composable("cart_screen"){

        }
    }
}