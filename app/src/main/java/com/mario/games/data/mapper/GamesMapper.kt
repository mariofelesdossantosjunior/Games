package com.mario.games.data.mapper

import com.mario.games.domain.entity.base.Record
import com.mario.games.domain.entity.gamedetails.GameDetailsEntity
import com.mario.games.domain.entity.games.GamesEntity
import com.mario.games.domain.entity.gamevideos.GameVideosEntity
import com.mario.games.remote.model.response.allgames.GetAllGamesResponse
import com.mario.games.remote.model.response.allgames.toEntity
import com.mario.games.remote.model.response.gamedetails.GetGameDetailsResponse
import com.mario.games.remote.model.response.gamedetails.toEntity
import com.mario.games.remote.model.response.gamevideos.GetGameVideosResponse
import com.mario.games.remote.model.response.gamevideos.toEntity
import com.mario.games.remote.model.response.search.SearchGamesResponse

class GamesMapper {

    fun mapGamesResponse(
        allGamesResponse: GetAllGamesResponse
    ): Record<GamesEntity> {
        return Record(GamesEntity(allGamesResponse.results.toEntity()), null)
    }

    fun mapGameDetailsResponse(
        gameDetailsResponse: GetGameDetailsResponse
    ): Record<GameDetailsEntity> {
        return Record(gameDetailsResponse.toEntity(), null)
    }

    fun mapGameVideosResponse(
        gameVideosResponse: GetGameVideosResponse
    ): Record<GameVideosEntity> {
        return Record(gameVideosResponse.toEntity(), null)
    }

    fun mapSearchGamesResponse(
        searchGamesResponse: SearchGamesResponse
    ): Record<GamesEntity> {
        return Record(GamesEntity(searchGamesResponse.results.toEntity()), null)
    }
}