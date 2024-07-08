package ru.plumsoftware.notekeeper.presentation.screens.note

import androidx.lifecycle.ViewModel
import ru.plumsoftware.notekeeper.presentation.screens.note.store.Intent
import ru.plumsoftware.notekeeper.presentation.screens.note.store.Output

class NoteScreenViewModel(
    private val output: (Output) -> Unit
) : ViewModel() {

    fun onIntent(intent: Intent) {
        when (intent) {
            Intent.BackClick -> {}
            Intent.FavoriteClick -> {}
            Intent.SaveClick -> {}
        }
    }

    fun onOutput(o: Output) {
        output(o)
    }
}