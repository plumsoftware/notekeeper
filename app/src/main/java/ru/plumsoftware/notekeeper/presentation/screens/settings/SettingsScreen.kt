package ru.plumsoftware.notekeeper.presentation.screens.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.components.settings.SettingsItem_Theme
import ru.plumsoftware.notekeeper.presentation.components.settings.SettingsTopAppBar
import ru.plumsoftware.notekeeper.presentation.screens.settings.store.SettingsScreenIntent
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun SettingsScreen(onIntent: (SettingsScreenIntent) -> Unit, navController: NavHostController) {
    Scaffold(
        topBar = {
            SettingsTopAppBar(
                onBackClick = {
                    onIntent(SettingsScreenIntent.OnBackClicked)
                },
                title = stringResource(id = R.string.settings_title)
            )
        }
    ) { scaffoldPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(
                space = UIAddons.Space.mediumSpace,
                alignment = Alignment.Top
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(scaffoldPadding)
                .padding(horizontal = UIAddons.Padding.mediumHorPadding)
        ) {
            item {
                SettingsItem_Theme(onThemeChanged = {
                    onIntent(SettingsScreenIntent.OnThemeChanged(value = it))
                })
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun SettingsPreview() {
    NotekeeperTheme {
        val settingsViewModel = SettingsViewModel()
        SettingsScreen(onIntent = settingsViewModel::onIntent, navController = rememberNavController())
    }
}