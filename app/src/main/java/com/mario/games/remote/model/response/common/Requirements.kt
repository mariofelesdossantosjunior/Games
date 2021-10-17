package com.mario.games.remote.model.response.common

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.RequirementsEntity

data class Requirements(
    @SerializedName("minimum")
    val minimum: String?,
    @SerializedName("recommended")
    val recommended: String?
)

fun Requirements.toEntity() = RequirementsEntity(minimum, recommended)