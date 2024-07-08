package ru.plumsoftware.notekeeper.presentation.screens.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Intent
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Output
import ru.plumsoftware.notekeeper.presentation.screens.main.store.State

class MainViewModel(
    private val output: (Output) -> Unit
) : ViewModel() {

    val state = MutableStateFlow(State())

    fun onIntent(intent: Intent) {
        when (intent) {
            Intent.AddNewNote -> {
                onOutput(Output.AddNewNote)
            }

            is Intent.ClickNote -> {
                onOutput(Output.ClickNote(value = intent.value))
            }

            Intent.ClickSettings -> {
                onOutput(Output.ClickSettings)
            }

            is Intent.SearchClick -> {
                state.update {
                    it.copy(
                        queryToSearch = intent.value
                    )
                }
            }
        }
    }

    fun onOutput(o: Output) {
        output(o)
    }
}