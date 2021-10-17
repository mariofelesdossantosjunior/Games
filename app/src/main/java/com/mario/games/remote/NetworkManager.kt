package com.mario.games.remote

import com.mario.games.remote.rest.RestApi

interface NetworkManager {
    fun restApi(): RestApi
}