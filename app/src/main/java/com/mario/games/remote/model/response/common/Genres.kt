package com.mario.games.remote.model.response.common

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.GenresEntity

data class Genres(
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

fun Genres.toEntity() = GenresEntity(id, name, slug, gamesCount, imageBackground)

fun List<Genres>.toEntity() = map { it.toEntity() }