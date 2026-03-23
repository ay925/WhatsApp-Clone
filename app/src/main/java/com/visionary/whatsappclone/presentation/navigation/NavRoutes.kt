package com.visionary.whatsappclone.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes {
    @Serializable
    object SplashScreen: NavRoutes()
    @Serializable
    object WelcomeScreen: NavRoutes()
    @Serializable
    object UserRegistrationScreen: NavRoutes()
    @Serializable
    object HomeScreen: NavRoutes()
    @Serializable
    object UpdatesScreen: NavRoutes()
    @Serializable
    object CommunitiesScreen: NavRoutes()
    @Serializable
    object CallsScreen: NavRoutes()

}