package com.mario.games.remote.model.response.gamedetails

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.PublishersEntity

data class Publishers(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("games_count")
    val games_count: Int,
    @SerializedName("image_background")
    val imageBackground: String
)

fun Publishers.toEntity() = PublishersEntity(id, name, slug, games_count, imageBackground)

fun List<Publishers>.toEntity() = map { it.toEntity() }