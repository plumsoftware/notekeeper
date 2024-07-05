package ru.plumsoftware.notekeeper.presentation.components.general

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun TaskItem(onDeleteClick: () -> Unit, onAddNewTask: () -> Unit, focusRequester: FocusRequester) {
    var checked by remember {
        mutableStateOf(
            false
        )
    }
    var text by remember {
        mutableStateOf(
            ""
        )
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
            .padding(UIAddons.Padding.noteScreenTaskItemPadding)
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = {
                checked = it
                onDeleteClick.invoke()
            },
            colors = CheckboxDefaults.colors(
                uncheckedColor = Color.White.copy(alpha = UIAddons.Alpha.checkBoxAlpha),
            )
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .focusRequester(focusRequester = focusRequester),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            textStyle = MaterialTheme.typography.bodyMedium,
            placeholder = {
                Text(
                    text = stringResource(id = R.string.placeholder_task_text),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color.White.copy(alpha = UIAddons.Alpha.placeHolderAlpha)
                    )
                )
            },
            maxLines = 1,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(
                onNext = {
                    onAddNewTask.invoke()
                }
            ),
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun TaskItemPreview() {
    NotekeeperTheme(dynamicColor = false) {
        ExtendedTheme {
            Scaffold(containerColor = ExtendedTheme.colors.blueTheme.colorContainer) {
                TaskItem(
                    {},
                    {},
                    remember {
                        FocusRequester()
                    })
            }
        }
    }
}