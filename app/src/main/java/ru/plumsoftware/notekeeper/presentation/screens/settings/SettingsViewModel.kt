package ru.plumsoftware.notekeeper.presentation.screens.settings

import androidx.lifecycle.ViewModel
import ru.plumsoftware.notekeeper.presentation.screens.settings.store.SettingsScreenIntent

class SettingsViewModel : ViewModel() {

    fun onIntent(settingsScreenIntent: SettingsScreenIntent) {
        when (settingsScreenIntent) {
            SettingsScreenIntent.OnBackClicked -> {

            }

            is SettingsScreenIntent.OnThemeChanged -> {

            }
        }
    }
}