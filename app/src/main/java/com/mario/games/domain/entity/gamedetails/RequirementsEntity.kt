package com.mario.games.domain.entity.gamedetails

data class RequirementsEntity(
    val minimum: String?,
    val recommended: String?
) {
    constructor() : this("", "")
}
