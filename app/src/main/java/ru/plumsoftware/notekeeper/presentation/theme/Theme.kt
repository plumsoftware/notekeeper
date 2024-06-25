package ru.plumsoftware.notekeeper.presentation.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Immutable
data class ExtendedColorScheme(
    val greenTheme: ColorFamily,
    val purpleTheme: ColorFamily,
    val orangeTheme: ColorFamily,
    val redTheme: ColorFamily,
    val cyanTheme: ColorFamily,
    val blueTheme: ColorFamily,
    val pinkTheme: ColorFamily,
)

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
)

val extendedLight = ExtendedColorScheme(
    greenTheme = ColorFamily(
        greenThemeLight,
        onGreenThemeLight,
        greenThemeContainerLight,
        onGreenThemeContainerLight,
    ),
    purpleTheme = ColorFamily(
        purpleThemeLight,
        onPurpleThemeLight,
        purpleThemeContainerLight,
        onPurpleThemeContainerLight,
    ),
    orangeTheme = ColorFamily(
        orangeThemeLight,
        onOrangeThemeLight,
        orangeThemeContainerLight,
        onOrangeThemeContainerLight,
    ),
    redTheme = ColorFamily(
        redThemeLight,
        onRedThemeLight,
        redThemeContainerLight,
        onRedThemeContainerLight,
    ),
    cyanTheme = ColorFamily(
        cyanThemeLight,
        onCyanThemeLight,
        cyanThemeContainerLight,
        onCyanThemeContainerLight,
    ),
    blueTheme = ColorFamily(
        blueThemeLight,
        onBlueThemeLight,
        blueThemeContainerLight,
        onBlueThemeContainerLight,
    ),
    pinkTheme = ColorFamily(
        pinkThemeLight,
        onPinkThemeLight,
        pinkThemeContainerLight,
        onPinkThemeContainerLight,
    ),
)

val extendedDark = ExtendedColorScheme(
    greenTheme = ColorFamily(
        greenThemeDark,
        onGreenThemeDark,
        greenThemeContainerDark,
        onGreenThemeContainerDark,
    ),
    purpleTheme = ColorFamily(
        purpleThemeDark,
        onPurpleThemeDark,
        purpleThemeContainerDark,
        onPurpleThemeContainerDark,
    ),
    orangeTheme = ColorFamily(
        orangeThemeDark,
        onOrangeThemeDark,
        orangeThemeContainerDark,
        onOrangeThemeContainerDark,
    ),
    redTheme = ColorFamily(
        redThemeDark,
        onRedThemeDark,
        redThemeContainerDark,
        onRedThemeContainerDark,
    ),
    cyanTheme = ColorFamily(
        cyanThemeDark,
        onCyanThemeDark,
        cyanThemeContainerDark,
        onCyanThemeContainerDark,
    ),
    blueTheme = ColorFamily(
        blueThemeDark,
        onBlueThemeDark,
        blueThemeContainerDark,
        onBlueThemeContainerDark,
    ),
    pinkTheme = ColorFamily(
        pinkThemeDark,
        onPinkThemeDark,
        pinkThemeContainerDark,
        onPinkThemeContainerDark,
    ),
)

val extendedLightMediumContrast = ExtendedColorScheme(
    greenTheme = ColorFamily(
        greenThemeLightMediumContrast,
        onGreenThemeLightMediumContrast,
        greenThemeContainerLightMediumContrast,
        onGreenThemeContainerLightMediumContrast,
    ),
    purpleTheme = ColorFamily(
        purpleThemeLightMediumContrast,
        onPurpleThemeLightMediumContrast,
        purpleThemeContainerLightMediumContrast,
        onPurpleThemeContainerLightMediumContrast,
    ),
    orangeTheme = ColorFamily(
        orangeThemeLightMediumContrast,
        onOrangeThemeLightMediumContrast,
        orangeThemeContainerLightMediumContrast,
        onOrangeThemeContainerLightMediumContrast,
    ),
    redTheme = ColorFamily(
        redThemeLightMediumContrast,
        onRedThemeLightMediumContrast,
        redThemeContainerLightMediumContrast,
        onRedThemeContainerLightMediumContrast,
    ),
    cyanTheme = ColorFamily(
        cyanThemeLightMediumContrast,
        onCyanThemeLightMediumContrast,
        cyanThemeContainerLightMediumContrast,
        onCyanThemeContainerLightMediumContrast,
    ),
    blueTheme = ColorFamily(
        blueThemeLightMediumContrast,
        onBlueThemeLightMediumContrast,
        blueThemeContainerLightMediumContrast,
        onBlueThemeContainerLightMediumContrast,
    ),
    pinkTheme = ColorFamily(
        pinkThemeLightMediumContrast,
        onPinkThemeLightMediumContrast,
        pinkThemeContainerLightMediumContrast,
        onPinkThemeContainerLightMediumContrast,
    ),
)

val extendedLightHighContrast = ExtendedColorScheme(
    greenTheme = ColorFamily(
        greenThemeLightHighContrast,
        onGreenThemeLightHighContrast,
        greenThemeContainerLightHighContrast,
        onGreenThemeContainerLightHighContrast,
    ),
    purpleTheme = ColorFamily(
        purpleThemeLightHighContrast,
        onPurpleThemeLightHighContrast,
        purpleThemeContainerLightHighContrast,
        onPurpleThemeContainerLightHighContrast,
    ),
    orangeTheme = ColorFamily(
        orangeThemeLightHighContrast,
        onOrangeThemeLightHighContrast,
        orangeThemeContainerLightHighContrast,
        onOrangeThemeContainerLightHighContrast,
    ),
    redTheme = ColorFamily(
        redThemeLightHighContrast,
        onRedThemeLightHighContrast,
        redThemeContainerLightHighContrast,
        onRedThemeContainerLightHighContrast,
    ),
    cyanTheme = ColorFamily(
        cyanThemeLightHighContrast,
        onCyanThemeLightHighContrast,
        cyanThemeContainerLightHighContrast,
        onCyanThemeContainerLightHighContrast,
    ),
    blueTheme = ColorFamily(
        blueThemeLightHighContrast,
        onBlueThemeLightHighContrast,
        blueThemeContainerLightHighContrast,
        onBlueThemeContainerLightHighContrast,
    ),
    pinkTheme = ColorFamily(
        pinkThemeLightHighContrast,
        onPinkThemeLightHighContrast,
        pinkThemeContainerLightHighContrast,
        onPinkThemeContainerLightHighContrast,
    ),
)

val extendedDarkMediumContrast = ExtendedColorScheme(
    greenTheme = ColorFamily(
        greenThemeDarkMediumContrast,
        onGreenThemeDarkMediumContrast,
        greenThemeContainerDarkMediumContrast,
        onGreenThemeContainerDarkMediumContrast,
    ),
    purpleTheme = ColorFamily(
        purpleThemeDarkMediumContrast,
        onPurpleThemeDarkMediumContrast,
        purpleThemeContainerDarkMediumContrast,
        onPurpleThemeContainerDarkMediumContrast,
    ),
    orangeTheme = ColorFamily(
        orangeThemeDarkMediumContrast,
        onOrangeThemeDarkMediumContrast,
        orangeThemeContainerDarkMediumContrast,
        onOrangeThemeContainerDarkMediumContrast,
    ),
    redTheme = ColorFamily(
        redThemeDarkMediumContrast,
        onRedThemeDarkMediumContrast,
        redThemeContainerDarkMediumContrast,
        onRedThemeContainerDarkMediumContrast,
    ),
    cyanTheme = ColorFamily(
        cyanThemeDarkMediumContrast,
        onCyanThemeDarkMediumContrast,
        cyanThemeContainerDarkMediumContrast,
        onCyanThemeContainerDarkMediumContrast,
    ),
    blueTheme = ColorFamily(
        blueThemeDarkMediumContrast,
        onBlueThemeDarkMediumContrast,
        blueThemeContainerDarkMediumContrast,
        onBlueThemeContainerDarkMediumContrast,
    ),
    pinkTheme = ColorFamily(
        pinkThemeDarkMediumContrast,
        onPinkThemeDarkMediumContrast,
        pinkThemeContainerDarkMediumContrast,
        onPinkThemeContainerDarkMediumContrast,
    ),
)

val extendedDarkHighContrast = ExtendedColorScheme(
    greenTheme = ColorFamily(
        greenThemeDarkHighContrast,
        onGreenThemeDarkHighContrast,
        greenThemeContainerDarkHighContrast,
        onGreenThemeContainerDarkHighContrast,
    ),
    purpleTheme = ColorFamily(
        purpleThemeDarkHighContrast,
        onPurpleThemeDarkHighContrast,
        purpleThemeContainerDarkHighContrast,
        onPurpleThemeContainerDarkHighContrast,
    ),
    orangeTheme = ColorFamily(
        orangeThemeDarkHighContrast,
        onOrangeThemeDarkHighContrast,
        orangeThemeContainerDarkHighContrast,
        onOrangeThemeContainerDarkHighContrast,
    ),
    redTheme = ColorFamily(
        redThemeDarkHighContrast,
        onRedThemeDarkHighContrast,
        redThemeContainerDarkHighContrast,
        onRedThemeContainerDarkHighContrast,
    ),
    cyanTheme = ColorFamily(
        cyanThemeDarkHighContrast,
        onCyanThemeDarkHighContrast,
        cyanThemeContainerDarkHighContrast,
        onCyanThemeContainerDarkHighContrast,
    ),
    blueTheme = ColorFamily(
        blueThemeDarkHighContrast,
        onBlueThemeDarkHighContrast,
        blueThemeContainerDarkHighContrast,
        onBlueThemeContainerDarkHighContrast,
    ),
    pinkTheme = ColorFamily(
        pinkThemeDarkHighContrast,
        onPinkThemeDarkHighContrast,
        pinkThemeContainerDarkHighContrast,
        onPinkThemeContainerDarkHighContrast,
    ),
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColorScheme(
        greenTheme = unspecified_scheme,
        purpleTheme = unspecified_scheme,
        orangeTheme = unspecified_scheme,
        redTheme = unspecified_scheme,
        cyanTheme = unspecified_scheme,
        blueTheme = unspecified_scheme,
        pinkTheme = unspecified_scheme
    )
}

@Composable
fun ExtendedTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }

    val extendedColors = if (darkTheme) extendedDark else extendedLight
    CompositionLocalProvider(LocalExtendedColors provides extendedColors) {
        MaterialTheme(
            content = content,
            typography = Typography,
            shapes = shapes,
            colorScheme = colorScheme
        )
    }
}

object ExtendedTheme {
    val colors: ExtendedColorScheme
        @Composable
        get() = LocalExtendedColors.current
}


@Composable
fun NotekeeperTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        typography = Typography,
        content = content,
        colorScheme = colorScheme,
        shapes = shapes
    )
}