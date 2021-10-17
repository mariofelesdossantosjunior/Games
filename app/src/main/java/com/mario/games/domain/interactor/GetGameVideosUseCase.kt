package com.mario.games.domain.interactor

import com.mario.games.domain.BaseUseCase
import com.mario.games.domain.entity.base.Record
import com.mario.games.domain.entity.gamevideos.GameVideosEntity
import com.mario.games.domain.repository.GamesRepository
import javax.inject.Inject

class GetGameVideosUseCase @Inject constructor(
    private val gamesRepository: GamesRepository
) : BaseUseCase<GetGameVideosUseCase.RequestValue, Record<GameVideosEntity>>() {

    override suspend fun run(request: RequestValue): Record<GameVideosEntity> {
        return gamesRepository.getGameVideos(request.gameId)
    }

    data class RequestValue(
        val gameId: Int
    )
}