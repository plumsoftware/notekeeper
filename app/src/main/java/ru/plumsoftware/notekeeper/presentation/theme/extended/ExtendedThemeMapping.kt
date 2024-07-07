package ru.plumsoftware.notekeeper.presentation.theme.extended

import androidx.compose.runtime.Composable
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme

@Composable
fun extendedThemeMapping(id: Int): ColorFamily {
    val map = mapOf<Int, ColorFamily>(
        0 to ExtendedTheme.colors.blueTheme,
        1 to ExtendedTheme.colors.cyanTheme,
        2 to ExtendedTheme.colors.greenTheme,
        3 to ExtendedTheme.colors.orangeTheme,
        4 to ExtendedTheme.colors.purpleTheme,
        5 to ExtendedTheme.colors.redTheme,
        6 to ExtendedTheme.colors.pinkTheme
    )

    return map[id]!!
}