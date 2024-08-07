package ru.plumsoftware.notekeeper

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.compose.koinViewModel
import ru.plumsoftware.notekeeper.presentation.screens.main.MainScreen
import ru.plumsoftware.notekeeper.presentation.screens.main.MainViewModel
import ru.plumsoftware.notekeeper.presentation.screens.settings.SettingsScreen
import ru.plumsoftware.notekeeper.presentation.screens.settings.SettingsViewModel
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedCrossfadeTargetStateParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val theme = remember {
                mutableStateOf(true)
            }

            Crossfade(targetState = theme, label = "", animationSpec = tween(800)) {
                NotekeeperTheme(darkTheme = theme.value) {
                    Scaffold {
                        val navController = rememberNavController()

                        NavHost(
                            navController = navController,
                            startDestination = Routing.NOTEBOOK_SCREEN
                        ) {
                            composable(route = Routing.NOTEBOOK_SCREEN) {
                                val mainViewModel: MainViewModel = koinViewModel()
                                MainScreen(
                                    onIntent = mainViewModel::onIntent,
                                    mainScreenState = mainViewModel.mainScreenState.collectAsState(),
                                    mainScreenEffect = mainViewModel.mainScreenEffect,
                                    navController = navController
                                )
                            }
                            composable(route = Routing.SETTINGS_SCREEN) {
                                val settingsViewModel: SettingsViewModel = koinViewModel()
                                SettingsScreen(
                                    onIntent = settingsViewModel::onIntent,
                                    navController = navController,
                                    settingsEffect = settingsViewModel.effect,
                                    theme = theme
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
