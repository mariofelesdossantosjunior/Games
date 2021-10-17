package com.mario.games.domain.entity.gamevideos

data class GameVideosEntity(
    val count: Int,
    val results: List<VideoResultEntity>
) {
    constructor() : this(0, arrayListOf())
}
