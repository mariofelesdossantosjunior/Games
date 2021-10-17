package com.mario.games.remote.rest

import com.mario.games.remote.model.request.GetAllGamesRequest
import com.mario.games.remote.model.request.GetGameDetailsRequest
import com.mario.games.remote.model.request.GetGameVideosRequest
import com.mario.games.remote.model.request.SearchGamesRequest
import com.mario.games.remote.model.response.allgames.GetAllGamesResponse
import com.mario.games.remote.model.response.gamedetails.GetGameDetailsResponse
import com.mario.games.remote.model.response.gamevideos.GetGameVideosResponse
import com.mario.games.remote.model.response.search.SearchGamesResponse
import com.mario.games.remote.retrofit.RetrofitApi

class RestApiImpl(
    private val retrofitApi: RetrofitApi
) : RestApi {

    override suspend fun getAllGames(getAllGamesRequest: GetAllGamesRequest): GetAllGamesResponse {
        return retrofitApi.getAllGames(getAllGamesRequest.nextPage, getAllGamesRequest.pageSize)
    }

    override suspend fun getGameDetails(getGameDetailsRequest: GetGameDetailsRequest): GetGameDetailsResponse {
        return retrofitApi.getGameDetails(getGameDetailsRequest.gameId)
    }

    override suspend fun getGameVideos(getGameVideosRequest: GetGameVideosRequest): GetGameVideosResponse {
        return retrofitApi.getGameVideos(getGameVideosRequest.gameId)
    }

    override suspend fun searchGames(searchGamesRequest: SearchGamesRequest): SearchGamesResponse {
        return retrofitApi.searchGames(searchGamesRequest.query)
    }
}