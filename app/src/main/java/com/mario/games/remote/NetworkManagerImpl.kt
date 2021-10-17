package com.mario.games.remote

import com.mario.games.remote.rest.RestApi

class NetworkManagerImpl(
    private val restApi: RestApi
) : NetworkManager {

    override fun restApi(): RestApi {
        return restApi
    }
}