package com.mario.games.domain.repository

import com.mario.games.domain.entity.base.Record
import com.mario.games.domain.entity.gamedetails.GameDetailsEntity
import com.mario.games.domain.entity.games.GamesEntity
import com.mario.games.domain.entity.gamevideos.GameVideosEntity

interface GamesRepository {

    suspend fun getAllGames(nextPage: Int): Record<GamesEntity>
    suspend fun getGameDetails(gameId: Int): Record<GameDetailsEntity>
    suspend fun getGameVideos(gameId: Int): Record<GameVideosEntity>
    suspend fun searchGames(query: String): Record<GamesEntity>
}