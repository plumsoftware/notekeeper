package ru.plumsoftware.notekeeper.presentation.screens.note

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.plumsoftware.notekeeper.presentation.components.notepage.NoteScreenTopAppBar
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme

@Composable
fun NoteScreen(noteScreenViewModel: NoteScreenViewModel) {
    Scaffold(topBar = {
        NoteScreenTopAppBar(
            onBackClick = { /*TODO*/ },
            onFavClick = { /*TODO*/ },
            save = { /*TODO*/ },
            onDeleteClick = { /*TODO*/ },
            onNotifyClick = { /*TODO*/ },
            colorFamily = ExtendedTheme.colors.blueTheme //TODO(Remove later)
        )
    }) { scaffoldPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(scaffoldPadding)
        )
    }
}