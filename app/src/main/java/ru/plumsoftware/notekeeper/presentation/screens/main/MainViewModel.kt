package ru.plumsoftware.notekeeper.presentation.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ru.plumsoftware.notekeeper.presentation.screens.main.store.MainScreenEffect
import ru.plumsoftware.notekeeper.presentation.screens.main.store.MainScreenIntent
import ru.plumsoftware.notekeeper.presentation.screens.main.store.MainScreenState

class MainViewModel : ViewModel() {

    val mainScreenState = MutableStateFlow(MainScreenState())
    val mainScreenEffect = MutableSharedFlow<MainScreenEffect>()

    fun onIntent(mainScreenIntent: MainScreenIntent) {
        when (mainScreenIntent) {
            MainScreenIntent.AddNewNote -> {
                viewModelScope.launch {
                    mainScreenEffect.emit(MainScreenEffect.AddNewNote)
                }
            }

            is MainScreenIntent.ClickNote -> {
                viewModelScope.launch {
                    mainScreenEffect.emit(MainScreenEffect.ClickNote(value = mainScreenIntent.value))
                }
            }

            MainScreenIntent.ClickSettings -> {
                viewModelScope.launch {
                    mainScreenEffect.emit(MainScreenEffect.ClickSettings)
                }
            }

            is MainScreenIntent.SearchClick -> {
                mainScreenState.update {
                    it.copy(
                        queryToSearch = mainScreenIntent.value
                    )
                }
            }

            is MainScreenIntent.ChangeSelectedAction -> {
                mainScreenState.update {
                    it.copy(drawerAction = mainScreenIntent.value)
                }
            }

            MainScreenIntent.ToggleDrawer -> {
                viewModelScope.launch {
                    mainScreenEffect.emit(MainScreenEffect.ToggleDrawer)
                }
            }
        }
    }
}