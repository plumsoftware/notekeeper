package ru.plumsoftware.notekeeper.presentation.screens.main

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.flow.MutableSharedFlow
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.Routing
import ru.plumsoftware.notekeeper.presentation.components.mainpage.MainScreenTopAppBar
import ru.plumsoftware.notekeeper.presentation.components.mainpage.SearchWithFilterField
import ru.plumsoftware.notekeeper.presentation.screens.main.store.MainScreenEffect
import ru.plumsoftware.notekeeper.presentation.screens.main.store.MainScreenIntent
import ru.plumsoftware.notekeeper.presentation.screens.main.store.MainScreenState
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(
    onIntent: (MainScreenIntent) -> Unit,
    mainScreenState: State<MainScreenState>,
    mainScreenEffect: MutableSharedFlow<MainScreenEffect>,
    navController: NavHostController
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    LaunchedEffect(key1 = Unit) {
        mainScreenEffect.collect { effect ->
            when (effect) {
                MainScreenEffect.AddNewNote -> {

                }

                is MainScreenEffect.ClickNote -> {

                }

                MainScreenEffect.ClickSettings -> {
                    navController.navigate(route = Routing.SETTINGS_SCREEN)
                }

                MainScreenEffect.ToggleDrawer -> {
                    drawerState.apply {
                        if (isOpen) close() else open()
                    }
                }
            }
        }
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text(
                    text = stringResource(id = R.string.app_name),
                    modifier = Modifier.padding(
                        UIAddons.Padding.mediumHorPadding,
                        UIAddons.Padding.mediumVerPadding
                    ),
                    style = MaterialTheme.typography.headlineLarge
                )
                Divider()

                mainScreenState.value.drawerList.forEach {
                    NavigationDrawerItem(
                        label = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(
                                    space = UIAddons.Space.mediumSpace,
                                    alignment = Alignment.Start
                                ),
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(UIAddons.Size.drawerWidth)
                            ) {
                                Icon(
                                    imageVector = it.imageVector,
                                    contentDescription = stringResource(id = it.contentDescription)
                                )
                                Text(
                                    text = stringResource(id = it.text),
                                    style = MaterialTheme.typography.titleLarge
                                )
                            }
                        },
                        selected = mainScreenState.value.drawerAction == it.drawerAction,
                        onClick = {
                            onIntent(MainScreenIntent.ChangeSelectedAction(value = it.drawerAction))
                        }
                    )
                }
            }
        },
    ) {
        Scaffold(
            topBar = {
                Column(
                    verticalArrangement = Arrangement.spacedBy(
                        space = UIAddons.Space.mediumSpace,
                        alignment = Alignment.Top
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(
                        UIAddons.Padding.mediumHorPadding,
                        UIAddons.Padding.mediumVerPadding
                    )
                ) {
                    MainScreenTopAppBar(
                        onDrawerClick = {
                            onIntent(MainScreenIntent.ToggleDrawer)
                        },
                        onSettingsClick = {
                            onIntent(MainScreenIntent.ClickSettings)
                        }
                    )
                    SearchWithFilterField(
                        text = stringResource(id = mainScreenState.value.drawerAction.string()),
                        onSearchClick = {
                            onIntent(MainScreenIntent.SearchClick(value = it))
                        }
                    )
                }
            }
        ) { scaffoldPadding ->

        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun MainScreenDarkPreview() {
    NotekeeperTheme {
        val mainViewModel = MainViewModel()
        MainScreen(
            mainViewModel::onIntent,
            mainViewModel.mainScreenState.collectAsState(),
            mainViewModel.mainScreenEffect,
            navController = rememberNavController()
        )
    }
}