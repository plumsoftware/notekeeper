package ru.plumsoftware.notekeeper.presentation.components.notepage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Bell-fill`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Chevron-left`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Star
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Trash2
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons
import ru.plumsoftware.notekeeper.presentation.theme.extended.ColorFamily

@Composable
fun NoteScreenTopAppBar(
    onBackClick: () -> Unit,
    onFavClick: () -> Unit,
    save: () -> Unit,
    onDeleteClick: () -> Unit,
    onNotifyClick: () -> Unit,
    colorFamily: ColorFamily,
    isNew: Boolean = false
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            space = UIAddons.Space.mediumSpace,
            alignment = Alignment.Start
        ),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(UIAddons.Padding.mainScreenTopAppBarPadding)
    ) {
        IconButton(onClick = onBackClick) {
            Icon(
                imageVector = NotekeeperIconPack.`Chevron-left`,
                contentDescription = stringResource(
                    id = R.string.back_click_note_screen_top_app_bar
                )
            )
        }

        Spacer(modifier = Modifier.weight(1.0f))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                space = UIAddons.Space.mediumSpace,
                alignment = Alignment.Start
            ),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
        ) {
            SaveButton(onClick = save, colorFamily = colorFamily)
            IconButton(onClick = onFavClick) {
                Icon(
                    imageVector = NotekeeperIconPack.Star,
                    contentDescription = stringResource(id = R.string.favorite_note_screen_top_app_bar)
                )
            }
            if (isNew)
                IconButton(onClick = onDeleteClick) {
                    Icon(
                        imageVector = NotekeeperIconPack.Trash2,
                        contentDescription = stringResource(id = R.string.favorite_note_screen_top_app_bar)
                    )
                }
            IconButton(onClick = onNotifyClick) {
                Icon(
                    imageVector = NotekeeperIconPack.`Bell-fill`,
                    contentDescription = stringResource(id = R.string.notify_screen_top_app_bar)
                )
            }
        }
    }
}