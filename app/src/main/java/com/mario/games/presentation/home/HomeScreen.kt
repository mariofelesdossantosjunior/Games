package com.mario.games.presentation.home

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.mario.games.R
import com.mario.games.presentation.commonui.HomeTopBar

@Composable
fun HomeScreen(
    openSearch: () -> Unit,
    openFilter: () -> Unit,
) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(topBar = {
        HomeTopBar(
            title = stringResource(id = R.string.app_name),
            searchClick = { openSearch.invoke() },
            filterClick = { }
        )
    },
        scaffoldState = scaffoldState,
        content = { }
    )
}