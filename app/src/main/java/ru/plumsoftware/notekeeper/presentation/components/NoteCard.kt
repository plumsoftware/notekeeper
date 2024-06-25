package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.presentation.theme.ColorFamily
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.ThemeAddons
import ru.plumsoftware.notekeeper.presentation.theme.UIAddons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteCard(
    onClick: () -> Unit,
    noteTitle: String,
    noteContent: String,
    noteDate: String,
    cardTheme: ColorFamily
) {
    ExtendedTheme {
        Card(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            shape = MaterialTheme.shapes.medium,
            colors = CardDefaults.cardColors(
                containerColor = cardTheme.colorContainer,
                contentColor = cardTheme.onColorContainer
            )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(space = UIAddons.Space.mediumSpace),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(
                        horizontal = UIAddons.Padding.mediumHorPadding,
                        vertical = UIAddons.Padding.mediumVerPadding
                    ),
            ) {
                Text(
                    text = noteTitle,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    style = MaterialTheme.typography.titleLarge.copy(color = cardTheme.onColorContainer)
                )
                Text(
                    text = noteContent,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    style = MaterialTheme.typography.bodyMedium.copy(color = cardTheme.onColorContainer)
                )
                Text(
                    text = noteDate,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = cardTheme.onColorContainer.copy(
                            alpha = ThemeAddons.Color.noteDateAlpha
                        )
                    ),
                    textAlign = TextAlign.End
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun note_preview() {
    ExtendedTheme {
        NoteCard(
            noteContent = "Note content",
            noteDate = "25.06.2024",
            noteTitle = "Note title",
            onClick = {},
            cardTheme = ExtendedTheme.colors.blueTheme
        )
    }
}