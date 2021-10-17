package com.mario.games.remote.model.response.common

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.StoresEntity


data class Stores(
    @SerializedName("id")
    val id: Int,
    @SerializedName("store")
    val store: Store
)

fun Stores.toEntity() = StoresEntity(id, store.toEntity())

fun List<Stores>.toEntity() = map { it.toEntity() }