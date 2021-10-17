package com.mario.games.remote.model.response.allgames

import com.google.gson.annotations.SerializedName

data class Year(
    @SerializedName("year")
    val year: Int,
    @SerializedName("nofollow")
    val noFollow: Boolean,
    @SerializedName("count")
    val count: Int
)