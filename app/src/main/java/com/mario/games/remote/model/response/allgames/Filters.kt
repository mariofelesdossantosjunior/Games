package com.mario.games.remote.model.response.allgames

import com.google.gson.annotations.SerializedName

data class Filters(
    @SerializedName("years")
    val years : List<Years>
)