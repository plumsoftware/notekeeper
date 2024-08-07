package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.data.model.Note

sealed class MainScreenEffect {
    data object AddNewNote : MainScreenEffect()
    data class ClickNote(val value: Note) : MainScreenEffect()
    data object ClickSettings : MainScreenEffect()
    data object ToggleDrawer : MainScreenEffect()
}