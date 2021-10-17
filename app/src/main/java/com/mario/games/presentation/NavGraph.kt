package com.mario.games.presentation

import androidx.navigation.NavHostController
import com.mario.games.presentation.Destinations.Filters
import com.mario.games.presentation.Destinations.GameDetails
import com.mario.games.presentation.Destinations.GameVideos
import com.mario.games.presentation.Destinations.Home
import com.mario.games.presentation.Destinations.Search

object Destinations {
    const val Home = "home"
    const val GameDetails = "gameDetails"
    const val Search = "search"
    const val Filters = "filters"
    const val GameVideos = "gameVideos"

    object GameDetailsArgs {
        const val GameId = "gameId"
    }

    object GameVideosArgs {
        const val GameIdVideo = "gameId"
    }
}

class Actions(navHostController: NavHostController) {
    val openSearch: () -> Unit = {
        navHostController.navigate(Search)
    }

    val openFilter: () -> Unit = {
        navHostController.navigate(Filters)
    }

    val openGameDetails: (Int) -> Unit = { gameId ->
        navHostController.popBackStack(route = Home, inclusive = false)
        navHostController.navigate("$GameDetails/$gameId")
    }

    val openGameVideos: (Int) -> Unit = { gameId ->
        navHostController.navigate("$GameVideos/$gameId")
    }

    val navigateBack: () -> Unit = {
        navHostController.navigateUp()
    }
}