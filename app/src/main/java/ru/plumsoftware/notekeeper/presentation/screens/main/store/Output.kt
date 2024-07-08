package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.data.model.Note

sealed class Output {
    data object AddNewNote : Output()
    data class ClickNote(val value: Note) : Output()
    data object ClickSettings : Output()
}