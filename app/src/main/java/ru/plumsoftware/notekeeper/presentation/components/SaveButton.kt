package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons
import ru.plumsoftware.notekeeper.presentation.theme.extended.ColorFamily

@Composable
fun SaveButton(onClick: () -> Unit, colorFamily: ColorFamily) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = colorFamily.onColorContainer
        ),
        contentPadding = UIAddons.Padding.buttonPadding,
        shape = MaterialTheme.shapes.medium
    ) {
        Text(
            text = stringResource(id = R.string.save),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun SaveButton_preview() {
    MaterialTheme{
        ExtendedTheme{
            SaveButton(onClick = {}, colorFamily = ExtendedTheme.colors.greenTheme)
        }
    }
}