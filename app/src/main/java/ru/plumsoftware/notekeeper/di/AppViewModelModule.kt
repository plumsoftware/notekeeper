package ru.plumsoftware.notekeeper.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.plumsoftware.notekeeper.presentation.screens.main.MainViewModel
import ru.plumsoftware.notekeeper.presentation.screens.settings.SettingsViewModel

val appViewModelModule = module {
    viewModel { parameters -> MainViewModel(parameters.get()) }
    viewModel { parameters -> SettingsViewModel(parameters.get()) }
}