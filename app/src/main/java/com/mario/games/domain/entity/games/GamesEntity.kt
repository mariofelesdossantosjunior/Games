package com.mario.games.domain.entity.games

data class GamesEntity(
    val gameEntities: List<GameResultsEntity>
) {
    constructor() : this(arrayListOf())
}
