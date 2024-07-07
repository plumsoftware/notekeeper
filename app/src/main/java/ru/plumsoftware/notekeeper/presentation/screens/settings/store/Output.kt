package ru.plumsoftware.notekeeper.presentation.screens.settings.store

sealed class Output {
    data object OnBackClicked : Output()
}