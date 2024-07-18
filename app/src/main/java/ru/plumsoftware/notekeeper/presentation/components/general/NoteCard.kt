package ru.plumsoftware.notekeeper.presentation.components.general

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
import ru.plumsoftware.data.model.database.note.Note
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.ThemeAddons
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons
import ru.plumsoftware.notekeeper.presentation.theme.extended.extendedThemeMapping
import ru.plumsoftware.notekeeper.utilities.dateFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteCard(
    onClick: () -> Unit,
    note: Note,
) {
    val colorFamily = extendedThemeMapping(id = note.themeId)
    ExtendedTheme {
        Card(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            shape = MaterialTheme.shapes.medium,
            colors = CardDefaults.cardColors(
                containerColor = colorFamily.colorContainer,
                contentColor = colorFamily.onColorContainer
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
                    text = note.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    style = MaterialTheme.typography.titleLarge.copy(color = colorFamily.onColorContainer)
                )
                Text(
                    text = note.content ?: "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    style = MaterialTheme.typography.bodyMedium.copy(color = colorFamily.onColorContainer)
                )
                Text(
                    text = dateFormatter(date = note.createDate, pattern = "hh:mm dd.MM.yyyy"),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = colorFamily.onColorContainer.copy(
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
private fun NotePreview() {
    ExtendedTheme {
        NoteCard(
            note = Note(
                noteId = 0,
                name = "Title",
                content = "Desc",
                themeId = 3,
                createDate = System.currentTimeMillis(),
                lastUpdateDate = System.currentTimeMillis()
            ),
            onClick = {}
        )
    }
}