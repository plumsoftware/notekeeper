package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.data.model.Note
import ru.plumsoftware.notekeeper.data.model.DrawerAction

sealed class Intent {
    data class ClickNote(val value: Note) : Intent()
    data object ClickSettings : Intent()
    data object AddNewNote : Intent()
    data class SearchClick(val value: String) : Intent()
    data class ChangeSelectedAction(val value: DrawerAction) : Intent()
    data object ToggleDrawer : Intent()
}