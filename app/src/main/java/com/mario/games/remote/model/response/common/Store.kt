package com.mario.games.remote.model.response.common

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.StoreEntity

data class Store(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("domain")
    val domain: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imageBackground: String
)

fun Store.toEntity() = StoreEntity(id, name, slug, domain, gamesCount, imageBackground)

fun List<Store>.toEntity() = map { it.toEntity() }
