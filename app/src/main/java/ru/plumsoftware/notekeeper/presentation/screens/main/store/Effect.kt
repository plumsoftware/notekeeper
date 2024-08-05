package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.data.model.Note

sealed class Effect {
    data object AddNewNote : Effect()
    data class ClickNote(val value: Note) : Effect()
    data object ClickSettings : Effect()
    data object ToggleDrawer : Effect()
}