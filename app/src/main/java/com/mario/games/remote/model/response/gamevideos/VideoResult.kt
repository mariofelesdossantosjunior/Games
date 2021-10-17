package com.mario.games.remote.model.response.gamevideos

import com.google.gson.annotations.SerializedName
import com.mario.games.domain.entity.gamevideos.VideoResultEntity

data class VideoResult(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("preview")
    val preview: String,
    @SerializedName("data")
    val data: VideoData
)

fun VideoResult.toEntity() =
    VideoResultEntity(preview = preview, name = name, video = data.toEntity(), id = id)

fun List<VideoResult>.toEntity() = map { it.toEntity() }
