package com.mario.games.domain.entity.gamedetails

data class GenresEntity(
    val id: Int,
    val name: String,
    val slug: String,
    val gamesCount: Int,
    val imageBackground: String
)
