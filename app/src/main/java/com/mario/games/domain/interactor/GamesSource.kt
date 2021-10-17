package com.mario.games.domain.interactor

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.mario.games.domain.entity.games.GameResultsEntity
import com.mario.games.domain.repository.GamesRepository
import javax.inject.Inject

class GamesSource @Inject constructor(
    private val gamesRepository: GamesRepository
) : PagingSource<Int, GameResultsEntity>() {

    override fun getRefreshKey(state: PagingState<Int, GameResultsEntity>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GameResultsEntity> {
        val nextPage = params.key ?: 1
        val gamesResponse = gamesRepository.getAllGames(nextPage)
        return if (gamesResponse.data == null) {
            LoadResult.Error(Exception(gamesResponse.error.toString()))
        } else {
            LoadResult.Page(
                data = gamesResponse.data.gameEntities,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = nextPage.plus(1)
            )
        }
    }
}