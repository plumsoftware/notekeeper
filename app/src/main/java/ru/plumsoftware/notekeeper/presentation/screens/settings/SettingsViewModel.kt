package ru.plumsoftware.notekeeper.presentation.screens.settings

import androidx.lifecycle.ViewModel
import ru.plumsoftware.notekeeper.presentation.screens.settings.store.Intent
import ru.plumsoftware.notekeeper.presentation.screens.settings.store.Output

class SettingsViewModel(
    val output: (Output) -> Unit
) : ViewModel() {

    fun onIntent(intent: Intent) {
        when (intent) {
            Intent.OnBackClicked -> {

            }

            is Intent.OnThemeChanged -> {

            }
        }
    }

    fun onOutput(o: Output) {
        output(o)
    }
}