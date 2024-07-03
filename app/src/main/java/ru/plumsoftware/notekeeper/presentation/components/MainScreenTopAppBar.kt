package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Gear-wide`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.MenuIcon
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

@Composable
fun MainScreenTopAppBar(onDrawerClick: () -> Unit, onSettingsClick: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(space = UIAddons.Space.mediumSpace),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(UIAddons.Padding.mainScreenTopAppBarPadding)
    ) {
        IconButton(
            onClick = onDrawerClick
        ) {
            Icon(
                imageVector = NotekeeperIconPack.MenuIcon,
                contentDescription = stringResource(id = R.string.drawer_icon)
            )
        }

        Spacer(modifier = Modifier.weight(1.0f))

        IconButton(
            onClick = onSettingsClick
        ) {
            Icon(
                imageVector = NotekeeperIconPack.`Gear-wide`,
                contentDescription = stringResource(id = R.string.drawer_icon)
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
private fun MainScreenTopAppBar_preview() {
    MaterialTheme {
        MainScreenTopAppBar({}, {})
    }
}