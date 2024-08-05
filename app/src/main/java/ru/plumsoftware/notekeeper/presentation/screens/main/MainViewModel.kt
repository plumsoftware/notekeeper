package ru.plumsoftware.notekeeper.presentation.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Effect
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Intent
import ru.plumsoftware.notekeeper.presentation.screens.main.store.State

class MainViewModel : ViewModel() {

    val state = MutableStateFlow(State())
    val effect = MutableSharedFlow<Effect>()

    fun onIntent(intent: Intent) {
        when (intent) {
            Intent.AddNewNote -> {
                viewModelScope.launch {
                    effect.emit(Effect.AddNewNote)
                }
            }

            is Intent.ClickNote -> {
                viewModelScope.launch {
                    effect.emit(Effect.ClickNote(value = intent.value))
                }
            }

            Intent.ClickSettings -> {
                viewModelScope.launch {
                    effect.emit(Effect.ClickSettings)
                }
            }

            is Intent.SearchClick -> {
                state.update {
                    it.copy(
                        queryToSearch = intent.value
                    )
                }
            }

            is Intent.ChangeSelectedAction -> {
                state.update {
                    it.copy(drawerAction = intent.value)
                }
            }

            Intent.ToggleDrawer -> {
                viewModelScope.launch {
                    effect.emit(Effect.ToggleDrawer)
                }
            }
        }
    }
}