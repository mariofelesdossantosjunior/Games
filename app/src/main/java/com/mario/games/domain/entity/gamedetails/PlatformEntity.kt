package com.mario.games.domain.entity.gamedetails

data class PlatformEntity(
    val id: Int,
    val name: String,
    val slug: String,
    val image: String?,
    val yearEnd: String?,
    val yearStart: String?,
    val gamesCount: Int,
    val imageBackground: String?
)