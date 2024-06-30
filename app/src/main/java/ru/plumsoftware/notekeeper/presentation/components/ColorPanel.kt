package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons
import ru.plumsoftware.notekeeper.presentation.theme.extended.ColorFamily

@Composable
fun ColorPanel(onColorClick: (ColorFamily) -> Unit) {
    val colors: List<ColorFamily> = UIAddons.NoteColors.getColors()
    val size by animateDpAsState(
        targetValue = UIAddons.NoteColors.noteColorSizeSelected.width,
        label = ""
    )
    var selectedColors by remember {
        mutableStateOf(colors[0])
    }

    ExtendedTheme {
        Card(
            elevation = CardDefaults.cardElevation(),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight(),
            shape = MaterialTheme.shapes.large,
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(
                    space = UIAddons.Space.mediumSpace,
                    alignment = Alignment.CenterHorizontally
                ),
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(paddingValues = UIAddons.Padding.cardColorPanelPadding),
            ) {
                itemsIndexed(colors) { index, item ->
                    Button(
                        onClick = {
                            onColorClick(item)
                            selectedColors = item
                        },
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = item.colorContainer
                        ),
                        modifier = Modifier
                            .testTag("${TestTags.colorButtonOnColorPanel} $index")
                            .size(if (selectedColors != item) UIAddons.NoteColors.noteColorSize.width else size)
                    ) {

                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ColorPanel_preview() {
    MaterialTheme {
        ExtendedTheme {
            ColorPanel {}
        }
    }
}