package com.krupnov.composition.domain.usecases

import com.krupnov.composition.domain.entity.GameSettings
import com.krupnov.composition.domain.entity.Level
import com.krupnov.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}