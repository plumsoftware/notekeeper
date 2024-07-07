package ru.plumsoftware.notekeeper.presentation.components.settings

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun SettingsItem_Theme(
    isDarkTheme: Boolean? = isSystemInDarkTheme(),
    onThemeChanged: (Boolean?) -> Unit
) {
    var expanded: Boolean by remember { mutableStateOf(false) }
    val rotation = animateFloatAsState(
        targetValue = if (expanded) 180f else 0f,
        animationSpec = tween(durationMillis = 200),
        label = "rotate icon button"
    )
    val strings = listOf(
        stringResource(id = R.string.settings_theme_text_light),
        stringResource(id = R.string.settings_theme_text_dark),
        stringResource(id = R.string.settings_theme_text_default)
    )

    val defText = if (isDarkTheme != null) {
        if (isDarkTheme) strings[1] else strings[0]
    } else strings[2]

    var selectedText by remember {
        mutableStateOf(defText)
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            space = UIAddons.Space.mediumSpace,
            alignment = Alignment.Start
        ),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = UIAddons.Padding.mediumHorPadding)
    ) {
        Text(
            text = stringResource(id = R.string.settings_theme_text),
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.weight(1.0f))
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(
                    space = UIAddons.Space.mediumSpace,
                    alignment = Alignment.Start
                )
            ) {
                IconButton(
                    onClick = { expanded = !expanded },
                    modifier = Modifier.testTag(TestTags.SettingsScreen.dropDownMenuButton_Theme)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.KeyboardArrowDown,
                        contentDescription = stringResource(id = R.string.drop_down_menu_icon_content_description),
                        modifier = Modifier.rotate(rotation.value)
                    )
                }
                Text(
                    text = selectedText,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.testTag(TestTags.SettingsScreen.dropDownMenuSelectedText_Theme)
                )
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = strings[0],
                            style = MaterialTheme.typography.labelSmall
                        )
                    },
                    onClick = {
                        expanded = false
                        selectedText = strings[0]
                        onThemeChanged(false)
                    }
                )
                DropdownMenuItem(
                    modifier = Modifier.testTag(TestTags.SettingsScreen.dropDownMenuItem2_Theme),
                    text = {
                        Text(
                            text = strings[1],
                            style = MaterialTheme.typography.labelSmall
                        )
                    },
                    onClick = {
                        expanded = false
                        selectedText = strings[1]
                        onThemeChanged(true)
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = strings[2],
                            style = MaterialTheme.typography.labelSmall
                        )
                    },
                    onClick = {
                        expanded = false
                        selectedText = strings[2]
                        onThemeChanged(null)
                    }
                )
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
private fun SettingsItem_ThemePreview() {
    NotekeeperTheme {
        Scaffold {
            SettingsItem_Theme(isDarkTheme = isSystemInDarkTheme(), {})
        }
    }
}