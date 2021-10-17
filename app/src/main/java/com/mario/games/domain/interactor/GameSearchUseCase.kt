package com.mario.games.domain.interactor

import com.mario.games.domain.BaseUseCase
import com.mario.games.domain.entity.base.Record
import com.mario.games.domain.entity.games.GamesEntity
import com.mario.games.domain.repository.GamesRepository
import javax.inject.Inject

class GameSearchUseCase @Inject constructor(
    private val gamesRepository: GamesRepository
) : BaseUseCase<GameSearchUseCase.RequestValue, Record<GamesEntity>>() {

    override suspend fun run(request: RequestValue): Record<GamesEntity> {
        return gamesRepository.searchGames(request.searchQuery)
    }

    data class RequestValue(val searchQuery: String)
}