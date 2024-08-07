package ru.plumsoftware.notekeeper.presentation.screens.settings.store

sealed class SettingsScreenIntent {
    data class OnThemeChanged(val value: Boolean?) : SettingsScreenIntent()
    data object OnBackClicked : SettingsScreenIntent()
}