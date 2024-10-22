package com.jesse.c24kknaviguide.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.jesse.c24kknaviguide.core.screen.DetailScreen
import com.jesse.c24kknaviguide.core.screen.HomeScreen
import com.jesse.c24kknaviguide.core.screen.LoginScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen {
                navController.navigate(Home)
            }
        }
        composable<Home> {
            HomeScreen { navController.navigate(Details(data = it)) }
        }
        composable<Details> {
            val gotoDetail = it.toRoute<Details>()
            DetailScreen(navBack = { navController.popBackStack() }, navToLogin = {
                navController.navigate(Login) {
                    popUpTo<Login>{
                        inclusive = true
                    }
                }
            }, name = gotoDetail.data)
        }
    }//
}