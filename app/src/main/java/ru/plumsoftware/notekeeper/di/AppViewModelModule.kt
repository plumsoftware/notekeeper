package ru.plumsoftware.notekeeper.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import ru.plumsoftware.notekeeper.presentation.screens.main.MainViewModel
import ru.plumsoftware.notekeeper.presentation.screens.settings.SettingsViewModel

val appViewModelModule = module {
    viewModelOf(::MainViewModel)
    viewModel { parameters -> SettingsViewModel(parameters.get()) }
}