package ru.plumsoftware.notekeeper.presentation.theme.addon

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.extended.ColorFamily

object UIAddons {
    object Space {
        val mediumSpace = 12.dp
    }

    object Padding {
        val mediumHorPadding = 10.dp
        val mediumVerPadding = 10.dp

        val iconButtonPadding =
            PaddingValues(horizontal = mediumHorPadding, vertical = mediumVerPadding)
        val buttonPadding =
            PaddingValues(horizontal = mediumHorPadding, vertical = mediumVerPadding)
        val cardColorPanelPadding =
            PaddingValues(horizontal = mediumHorPadding, vertical = mediumVerPadding)
    }

    object NoteColors {

        val noteColorSize = DpSize(width = 24.dp, height = 24.dp)
        val noteColorSizeSelected = DpSize(width = 40.dp, height = 40.dp)

        @Composable
        fun getColors(): List<ColorFamily> {
            return listOf(
                ExtendedTheme.colors.blueTheme,
                ExtendedTheme.colors.redTheme,
                ExtendedTheme.colors.pinkTheme,
                ExtendedTheme.colors.purpleTheme,
                ExtendedTheme.colors.orangeTheme,
                ExtendedTheme.colors.greenTheme,
                ExtendedTheme.colors.cyanTheme,
            )
        }
    }
}