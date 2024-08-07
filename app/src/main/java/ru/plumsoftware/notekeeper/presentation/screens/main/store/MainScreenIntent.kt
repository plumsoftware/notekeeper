package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.data.model.Note
import ru.plumsoftware.notekeeper.data.model.DrawerAction

sealed class MainScreenIntent {
    data class ClickNote(val value: Note) : MainScreenIntent()
    data object ClickSettings : MainScreenIntent()
    data object AddNewNote : MainScreenIntent()
    data class SearchClick(val value: String) : MainScreenIntent()
    data class ChangeSelectedAction(val value: DrawerAction) : MainScreenIntent()
    data object ToggleDrawer : MainScreenIntent()
}