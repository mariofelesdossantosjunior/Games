package com.mario.games.domain.entity.gamedetails

data class RatingsEntity(
    val id: Int,
    val title: String,
    val count: Int,
    val percent: Double
)
