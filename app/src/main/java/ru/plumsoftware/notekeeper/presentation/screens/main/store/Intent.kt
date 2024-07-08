package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.data.model.Note

sealed class Intent {
    data class ClickNote(val value: Note) : Intent()
    data object ClickSettings : Intent()
    data object AddNewNote : Intent()
    data class SearchClick(val value: String) : Intent()
}