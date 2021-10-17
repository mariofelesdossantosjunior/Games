package com.mario.games.remote.model.response.gamedetails

import com.google.gson.annotations.SerializedName
import com.mario.games.remote.model.response.common.Platform

data class MetaCriticPlatforms(
    @SerializedName("metascore")
    val metaScore: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("platform")
    val platform: Platform
)
