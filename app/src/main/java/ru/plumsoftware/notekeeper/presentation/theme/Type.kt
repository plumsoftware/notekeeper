package ru.plumsoftware.notekeeper.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.theme.addon.ThemeAddons

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val bodyFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Roboto"),
        fontProvider = provider,
    )
)

val displayFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Roboto"),
        fontProvider = provider,
    )
)

val baseline = Typography()

val Typography = Typography(
    displayLarge = TextStyle(
        fontWeight = FontWeight.Black
    ),
    displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),

    titleLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = bodyFontFamily,
        fontSize = ThemeAddons.TypeSize.titleLarge
    ),
    titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),

    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = bodyFontFamily,
        fontSize = ThemeAddons.TypeSize.bodyLarge
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = bodyFontFamily,
        fontSize = ThemeAddons.TypeSize.bodyMedium
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = bodyFontFamily,
        fontSize = ThemeAddons.TypeSize.bodySmall
    ),

    labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
)