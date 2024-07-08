package ru.plumsoftware.notekeeper.presentation.screens.note.store

sealed class Intent {
    data object SaveClick : Intent()
    data object BackClick : Intent()
    data object FavoriteClick : Intent()
}