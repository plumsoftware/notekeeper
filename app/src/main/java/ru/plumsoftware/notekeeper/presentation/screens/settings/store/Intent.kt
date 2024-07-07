package ru.plumsoftware.notekeeper.presentation.screens.settings.store

sealed class Intent {
    data class OnThemeChanged(val value: Boolean?) : Intent()
    data object OnBackClicked : Intent()
}