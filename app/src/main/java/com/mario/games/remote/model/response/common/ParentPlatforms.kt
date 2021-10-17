package com.mario.games.remote.model.response.common

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamedetails.ParentPlatformsEntity

data class ParentPlatforms(
    @SerializedName("platform")
    val platform: Platform
)

fun ParentPlatforms.toEntity() = ParentPlatformsEntity(platform.toEntity())

fun List<ParentPlatforms>.toEntity() = map { it.toEntity() }