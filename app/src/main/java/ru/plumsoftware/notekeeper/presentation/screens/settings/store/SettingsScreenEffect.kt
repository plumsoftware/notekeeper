package ru.plumsoftware.notekeeper.presentation.screens.settings.store

sealed class SettingsScreenEffect {
    data class ChangeTheme(val value: Boolean?) : SettingsScreenEffect()
    data object BackClick : SettingsScreenEffect()
}