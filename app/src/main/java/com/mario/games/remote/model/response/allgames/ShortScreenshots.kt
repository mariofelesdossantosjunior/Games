package com.mario.games.remote.model.response.allgames

import com.google.gson.annotations.SerializedName

data class ShortScreenshots(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String
)