package com.mario.games.remote.model.response.gamevideos

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamevideos.GameVideosEntity

data class GetGameVideosResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<VideoResult>
)

fun GetGameVideosResponse.toEntity() = GameVideosEntity(count = count, results = results.toEntity())