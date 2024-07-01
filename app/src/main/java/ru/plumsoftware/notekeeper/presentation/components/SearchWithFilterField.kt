package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun SearchWithFilterField(text: String, onSearchClick: () -> Unit) {
    var showTextField by remember { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(showTextField) {
        if (showTextField) {
            focusRequester.requestFocus()
        }
    }

    AnimatedVisibility(
        visible = showTextField,
        enter = fadeIn(animationSpec = tween(durationMillis = 200)),
        exit = fadeOut(animationSpec = tween(durationMillis = 200))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                space = UIAddons.Space.largeSpace,
                alignment = Alignment.Start
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(UIAddons.Padding.searchWithFilterFieldPadding)
        ) {
            OutlinedTextField(
                value = text,
                onValueChange = {

                },
                label = { Text("Поиск") },
                modifier = Modifier
                    .weight(1f)
                    .focusRequester(focusRequester)
                    .testTag(TestTags.searchFieldOnMainScreen),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            )
            IconButton(
                onClick = onSearchClick
            ) {
                Icon(imageVector = Icons.Rounded.Search, contentDescription = "")
            }
        }
    }

    if (!showTextField) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                space = UIAddons.Space.largeSpace,
                alignment = Alignment.Start
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(UIAddons.Padding.searchWithFilterFieldPadding)
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = MaterialTheme.typography.bodyLarge.color.copy(alpha = UIAddons.Alpha.searchWithFilterFieldAlpha)
                ),
                modifier = Modifier.weight(1f)
            )
            IconButton(
                onClick = {
                    showTextField = true
                },
                modifier = Modifier
                    .testTag(TestTags.searchButton1)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = ""
                )
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
private fun SearchWithFilterField_preview() {
    MaterialTheme {
        SearchWithFilterField(text = "Заметки на 3 дня вперёд", onSearchClick = {})
    }
}