package com.mario.games.remote.model.request

import com.mario.games.remote.ApiConstants

data class GetAllGamesRequest(
    val nextPage: Int,
    val pageSize: Int = ApiConstants.PAGE_SIZE
)