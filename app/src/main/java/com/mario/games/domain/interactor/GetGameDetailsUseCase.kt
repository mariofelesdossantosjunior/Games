package com.mario.games.domain.interactor

import com.mario.games.domain.BaseUseCase
import com.mario.games.domain.entity.base.Record
import com.mario.games.domain.entity.gamedetails.GameDetailsEntity
import com.mario.games.domain.repository.GamesRepository
import javax.inject.Inject

class GetGameDetailsUseCase @Inject constructor(
    private val gamesRepository: GamesRepository
) : BaseUseCase<GetGameDetailsUseCase.RequestValue, Record<GameDetailsEntity>>() {

    override suspend fun run(request: RequestValue): Record<GameDetailsEntity> {
        return gamesRepository.getGameDetails(request.gameId)
    }

    data class RequestValue(
        val gameId: Int
    )
}