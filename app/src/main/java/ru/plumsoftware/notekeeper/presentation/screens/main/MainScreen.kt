package ru.plumsoftware.notekeeper.presentation.screens.main

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.collect
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.components.mainpage.MainScreenTopAppBar
import ru.plumsoftware.notekeeper.presentation.components.mainpage.SearchWithFilterField
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Effect
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Intent
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(mainViewModel: MainViewModel) {
    val state = mainViewModel.state.collectAsState().value
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    LaunchedEffect(key1 = Unit) {
        mainViewModel.effect.collect { effect ->
            when (effect) {
                Effect.AddNewNote -> {

                }

                is Effect.ClickNote -> {

                }

                Effect.ClickSettings -> {

                }

                Effect.ToggleDrawer -> {
                    drawerState.apply {
                        if (isClosed) open() else close()
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
                    modifier = Modifier.padding(UIAddons.Padding.mediumHorPadding),
                    style = MaterialTheme.typography.headlineLarge
                )
                Divider()

                state.drawerList.forEach {
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
                        selected = state.drawerAction == it.drawerAction,
                        onClick = {
                            mainViewModel.onIntent(Intent.ChangeSelectedAction(value = it.drawerAction))
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
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MainScreenTopAppBar(
                        onDrawerClick = {
                            mainViewModel.onIntent(Intent.ToggleDrawer)
                        },
                        onSettingsClick = {}
                    )
                    SearchWithFilterField(
                        text = stringResource(id = state.drawerAction.string()),
                        onSearchClick = {
                            mainViewModel.onIntent(Intent.SearchClick(value = it))
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
        MainScreen(
            mainViewModel = MainViewModel()
        )
    }
}