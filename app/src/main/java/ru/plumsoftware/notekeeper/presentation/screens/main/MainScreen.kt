package ru.plumsoftware.notekeeper.presentation.screens.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import ru.plumsoftware.notekeeper.model.list
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.components.mainpage.LeftDrawer
import ru.plumsoftware.notekeeper.presentation.components.mainpage.MainScreenTopAppBar
import ru.plumsoftware.notekeeper.presentation.components.mainpage.SearchWithFilterField
import ru.plumsoftware.notekeeper.presentation.screens.main.store.Intent
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun MainScreen(mainViewModel: MainViewModel) {
    var drawerOpen by remember { mutableStateOf(false) }
    val state = mainViewModel.state.collectAsState().value

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
                    onDrawerClick = { drawerOpen = true },
                    onSettingsClick = {}
                )
                SearchWithFilterField(
                    text = state.drawerAction.toString(),
                    onSearchClick = {
                        mainViewModel.onIntent(Intent.SearchClick(value = it))
                    }
                )
            }
        }
    ) { scaffoldPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(scaffoldPadding)
                .padding(
                    start = UIAddons.Padding.mediumHorPadding,
                    end = UIAddons.Padding.mediumHorPadding,
                    bottom = UIAddons.Padding.mediumVerPadding
                )
        ) {
            AnimatedVisibility(
                visible = drawerOpen,
                enter = slideInHorizontally(
                    animationSpec = tween(durationMillis = 200),
                ),
                exit = slideOutHorizontally(
                    animationSpec = tween(durationMillis = 200)
                )
            ) {
                LeftDrawer(list = list, onClick = { drawerOpen = false })
            }

            if (drawerOpen)
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background.copy(alpha = UIAddons.Alpha.placeHolderAlpha))
                        .clickable {
                            if (drawerOpen) {
                                drawerOpen = false
                            }
                        }
                        .align(Alignment.Center)
                        .testTag(TestTags.MainScreen.mainScreenDrawerBackBox),
                    content = {}
                )
        }
    }
}