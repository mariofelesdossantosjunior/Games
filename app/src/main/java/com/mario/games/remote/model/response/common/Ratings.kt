package com.mario.games.remote.model.response.common

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.RatingsEntity

data class Ratings(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("count")
    val count: Int,
    @SerializedName("percent")
    val percent: Double
)

fun Ratings.toEntity() = RatingsEntity(id, title, count, percent)

fun List<Ratings>.toEntity() = map { it.toEntity() }