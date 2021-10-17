package com.mario.games.data

import com.mario.games.remote.NetworkManager
import com.mario.games.remote.NetworkManagerImpl
import com.mario.games.remote.rest.RestApi
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    private val restApi: RestApi
) : DataSource {

    override fun api(): NetworkManager {
        return NetworkManagerImpl(restApi = restApi)
    }
}