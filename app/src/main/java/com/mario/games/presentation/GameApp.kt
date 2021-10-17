package com.mario.games.presentation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mario.games.presentation.Destinations.Home
import com.mario.games.presentation.home.HomeScreen

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Composable
fun GameApp() {

    val navController = rememberNavController()
    val actions = remember(navController) { Actions(navController) }
    NavHost(
        navController = navController,
        startDestination = Home
    ) {
        composable(Home) {
            HomeScreen(
                openSearch = actions.openSearch,
                openFilter = actions.openFilter
            )
        }
    }
}