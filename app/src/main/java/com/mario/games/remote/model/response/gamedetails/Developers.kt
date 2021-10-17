package com.mario.games.remote.model.response.gamedetails

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.DevelopersEntity

data class Developers(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imageBackground: String
)

fun Developers.toEntity() = DevelopersEntity(id, name, slug, gamesCount, imageBackground)

fun List<Developers>.toEntity() = map { it.toEntity() }