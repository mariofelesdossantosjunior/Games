package com.mario.games.data

import com.mario.games.remote.NetworkManager

interface DataSource {
    fun api(): NetworkManager
}