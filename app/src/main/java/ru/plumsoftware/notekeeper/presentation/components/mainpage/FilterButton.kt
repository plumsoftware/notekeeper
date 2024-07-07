package ru.plumsoftware.notekeeper.presentation.components.mainpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Clock
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun FilterButton(onClick: () -> Unit, imageVector: ImageVector, text: String, contentDescription: String) {
    val modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
    IconButton(
        onClick = onClick,
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = Color.Transparent,
        ),
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                space = UIAddons.Space.mediumSpace,
                alignment = Alignment.Start
            ),
            modifier = modifier.padding(UIAddons.Padding.iconButtonPadding)
        ) {
            Icon(imageVector = imageVector, contentDescription = contentDescription)
            Text(text = text, style = MaterialTheme.typography.bodyMedium, modifier = modifier)
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun FilterButton_preview() {
    MaterialTheme {
        FilterButton(onClick = {}, imageVector = NotekeeperIconPack.Clock, text = "3 дня", contentDescription = "")
    }
}