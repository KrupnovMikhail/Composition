package com.krupnov.composition.domain.repository

import com.krupnov.composition.domain.entity.GameSettings
import com.krupnov.composition.domain.entity.Level
import com.krupnov.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}