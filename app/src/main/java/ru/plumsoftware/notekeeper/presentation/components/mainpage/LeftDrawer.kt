package ru.plumsoftware.notekeeper.presentation.components.mainpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.data.model.DrawerAction
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons
import ru.plumsoftware.notekeeper.data.model.DrawerItem
import ru.plumsoftware.notekeeper.data.model.list

@Composable
fun LeftDrawer(list: List<DrawerItem>, onClick: (DrawerAction) -> Unit) {
    val modifier = Modifier
        .wrapContentHeight()

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(
            space = UIAddons.Space.mediumSpace,
            alignment = Alignment.Top
        ),
        modifier = Modifier
            .fillMaxHeight()
            .width(UIAddons.Size.drawerWidth)
    ) {
        itemsIndexed(list) { index, item ->
            if (index == list.size - 1) {
                Divider(
                    modifier = Modifier.fillParentMaxWidth(),
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = UIAddons.Alpha.dividerOnDrawerAlpha)
                )
            }
            IconButton(
                onClick = { onClick(item.drawerAction) },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.onBackground
                ),
                modifier = modifier
                    .fillParentMaxSize()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(
                        space = UIAddons.Space.mediumSpace,
                        alignment = Alignment.Start
                    ),
                    modifier = modifier
                        .fillParentMaxSize()
                ) {
                    Icon(
                        imageVector = item.imageVector,
                        contentDescription = stringResource(id = item.contentDescription)
                    )
                    Text(
                        text = stringResource(id = item.text),
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun LeftDrawer_preview() {
    MaterialTheme {
        LeftDrawer(list = list, onClick = { drawerAction -> })
    }
}