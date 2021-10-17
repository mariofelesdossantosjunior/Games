package com.mario.games.data.repository

import com.mario.games.data.DataSource
import com.mario.games.data.mapper.ErrorMapper
import com.mario.games.data.mapper.GamesMapper
import com.mario.games.domain.entity.base.Record
import com.mario.games.domain.entity.gamedetails.GameDetailsEntity
import com.mario.games.domain.entity.games.GamesEntity
import com.mario.games.domain.entity.gamevideos.GameVideosEntity
import com.mario.games.domain.repository.GamesRepository
import com.mario.games.remote.RemoteException
import com.mario.games.remote.model.request.GetAllGamesRequest
import com.mario.games.remote.model.request.GetGameDetailsRequest
import com.mario.games.remote.model.request.GetGameVideosRequest
import com.mario.games.remote.model.request.SearchGamesRequest
import javax.inject.Inject

class GamesRepositoryImpl @Inject constructor(
    private val dataSource: DataSource
) : GamesRepository {

    private val gamesMapper = GamesMapper()
    private val errorMapper = ErrorMapper()

    override suspend fun getAllGames(
        nextPage: Int
    ): Record<GamesEntity> {
        return try {
            dataSource.api()
                .restApi()
                .getAllGames(GetAllGamesRequest(nextPage))
                .run {
                    gamesMapper.mapGamesResponse(this)
                }
        } catch (e: RemoteException) {
            errorMapper.mapErrorRecord(e)
        }
    }

    override suspend fun getGameDetails(
        gameId: Int
    ): Record<GameDetailsEntity> {
        return try {
            dataSource.api()
                .restApi()
                .getGameDetails(GetGameDetailsRequest(gameId))
                .run {
                    gamesMapper.mapGameDetailsResponse(this)
                }
        } catch (e: RemoteException) {
            errorMapper.mapErrorRecord(e)
        }
    }

    override suspend fun getGameVideos(
        gameId: Int
    ): Record<GameVideosEntity> {
        return try {
            dataSource.api()
                .restApi()
                .getGameVideos(GetGameVideosRequest((gameId)))
                .run {
                    gamesMapper.mapGameVideosResponse(this)
                }
        } catch (e: RemoteException) {
            errorMapper.mapErrorRecord(e)
        }
    }

    override suspend fun searchGames(
        query: String
    ): Record<GamesEntity> {
        return try {
            dataSource.api()
                .restApi()
                .searchGames(SearchGamesRequest(query))
                .run {
                    gamesMapper.mapSearchGamesResponse(this)
                }
        } catch (e: RemoteException) {
            errorMapper.mapErrorRecord(e)
        }
    }
}