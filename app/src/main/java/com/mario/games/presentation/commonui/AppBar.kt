package com.mario.games.presentation.commonui

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mario.games.presentation.theme.Purple700

@Composable
fun HomeTopBar(
    title: String,
    modifier: Modifier = Modifier,
    searchClick: () -> Unit,
    filterClick: () -> Unit
) {
    TopAppBar(
        title = { Text(text = title, color = Color.White) },
        modifier = modifier,
        backgroundColor = Purple700,
        actions = {
            IconButton(onClick = searchClick) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.White
                )
            }
            IconButton(onClick = filterClick) {
                Icon(
                    imageVector = Icons.Filled.FilterList,
                    contentDescription = "Filter",
                    tint = Color.White
                )
            }
        }
    )
}

@Preview
@Composable
fun HomeAppBarPreview() {
    HomeTopBar(title = "Game", searchClick = {}, filterClick = {})
}