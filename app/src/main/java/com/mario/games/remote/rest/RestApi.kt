package com.mario.games.remote.rest

import com.mario.games.remote.model.request.GetAllGamesRequest
import com.mario.games.remote.model.request.GetGameDetailsRequest
import com.mario.games.remote.model.request.GetGameVideosRequest
import com.mario.games.remote.model.request.SearchGamesRequest
import com.mario.games.remote.model.response.allgames.GetAllGamesResponse
import com.mario.games.remote.model.response.gamedetails.GetGameDetailsResponse
import com.mario.games.remote.model.response.gamevideos.GetGameVideosResponse
import com.mario.games.remote.model.response.search.SearchGamesResponse

interface RestApi {
    suspend fun getAllGames(getAllGamesRequest: GetAllGamesRequest): GetAllGamesResponse
    suspend fun getGameDetails(getGameDetailsRequest: GetGameDetailsRequest): GetGameDetailsResponse
    suspend fun getGameVideos(getGameVideosRequest: GetGameVideosRequest): GetGameVideosResponse
    suspend fun searchGames(searchGamesRequest: SearchGamesRequest): SearchGamesResponse
}