package com.mario.games.remote.model.response.gamevideos

import com.google.gson.annotations.SerializedName

data class VideoData(
    @SerializedName("480")
    val medium: String,
    @SerializedName("max")
    val max: String
)

fun VideoData.toEntity() = max
