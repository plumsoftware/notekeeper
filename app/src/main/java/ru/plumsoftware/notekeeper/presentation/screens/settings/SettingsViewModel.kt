package ru.plumsoftware.notekeeper.presentation.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import ru.plumsoftware.notekeeper.presentation.screens.settings.store.SettingsScreenEffect
import ru.plumsoftware.notekeeper.presentation.screens.settings.store.SettingsScreenIntent

class SettingsViewModel : ViewModel() {

    val effect = MutableSharedFlow<SettingsScreenEffect>()

    fun onIntent(settingsScreenIntent: SettingsScreenIntent) {
        when (settingsScreenIntent) {
            SettingsScreenIntent.OnBackClicked -> {
                viewModelScope.launch {
                    effect.emit(SettingsScreenEffect.BackClick)
                }
            }

            is SettingsScreenIntent.OnThemeChanged -> {
                viewModelScope.launch {
                    effect.emit(SettingsScreenEffect.ChangeTheme(value = settingsScreenIntent.value))
                }
            }
        }
    }
}