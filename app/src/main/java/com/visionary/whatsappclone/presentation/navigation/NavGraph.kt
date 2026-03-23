package com.visionary.whatsappclone.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.visionary.whatsappclone.presentation.screens.callsscreen.CallsScreen
import com.visionary.whatsappclone.presentation.screens.communitiesscreen.CommunitiesScreen
import com.visionary.whatsappclone.presentation.screens.homescreen.HomeScreen
import com.visionary.whatsappclone.presentation.screens.splashscreen.SplashScreen
import com.visionary.whatsappclone.presentation.screens.updatesscreen.UpdatesScreen
import com.visionary.whatsappclone.presentation.screens.userregistrationscreen.UserRegistrationScreen
import com.visionary.whatsappclone.presentation.screens.welcomescreen.WelcomeScreen


@Preview
@Composable
fun NavGraph() {
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = NavRoutes.SplashScreen){
        composable<NavRoutes.SplashScreen> {
            SplashScreen(navController)
        }
        composable<NavRoutes.WelcomeScreen> {
            WelcomeScreen(navController)
        }
        composable<NavRoutes.UserRegistrationScreen> {
            UserRegistrationScreen(navController)
        }
        composable<NavRoutes.HomeScreen> {
            HomeScreen(navController)
        }
        composable<NavRoutes.UpdatesScreen> {
            UpdatesScreen(navController)
        }
        composable<NavRoutes.CommunitiesScreen> {
            CommunitiesScreen(navController)
        }
        composable<NavRoutes.CallsScreen> {
            CallsScreen(navController)
        }
    }
}