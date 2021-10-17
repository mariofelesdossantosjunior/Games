package com.mario.games.remote.model.response.allgames

import com.google.gson.annotations.SerializedName

data class Years(
    @SerializedName("from")
    val from: Int,
    @SerializedName("to")
    val to: Int,
    @SerializedName("filter")
    val filter: String,
    @SerializedName("decade")
    val decade: Int,
    @SerializedName("years") val years: List<Year>,
)