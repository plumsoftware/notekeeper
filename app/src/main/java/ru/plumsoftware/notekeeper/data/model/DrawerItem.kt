package ru.plumsoftware.notekeeper.data.model

import androidx.compose.ui.graphics.vector.ImageVector
import ru.plumsoftware.notekeeper.R
import ru.plumsoftware.notekeeper.presentation.NotekeeperIconPack
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.*

data class DrawerItem(
    val imageVector: ImageVector,
    val text: Int,
    val contentDescription: Int,
    val drawerAction: DrawerAction
)

enum class DrawerAction {
    _3_DAYS,
    _7_DAYS,
    _14_DAYS,
    _1_MONTH,
    FAVORITES,
    BUG_REPORT
}

val list = listOf(
    DrawerItem(
        imageVector = NotekeeperIconPack.Clock,
        text = R.string._3_days,
        contentDescription = R.string._3_days,
        drawerAction = DrawerAction._3_DAYS
    ),
    DrawerItem(
        imageVector = NotekeeperIconPack.`Calendar-week`,
        text = R.string._7_days,
        contentDescription = R.string._7_days,
        drawerAction = DrawerAction._7_DAYS
    ),
    DrawerItem(
        imageVector = NotekeeperIconPack.`Calendar-range`,
        text = R.string._14_days,
        contentDescription = R.string._14_days,
        drawerAction = DrawerAction._14_DAYS
    ),
    DrawerItem(
        imageVector = NotekeeperIconPack.Calendar3,
        text = R.string._1_month,
        contentDescription = R.string._1_month,
        drawerAction = DrawerAction._1_MONTH
    ),
    DrawerItem(
        imageVector = NotekeeperIconPack.`Star-half`,
        text = R.string.favorites,
        contentDescription = R.string.favorites,
        drawerAction = DrawerAction.FAVORITES
    ),
    DrawerItem(
        imageVector = NotekeeperIconPack.`Bug-fill`,
        text = R.string.bug_report,
        contentDescription = R.string.bug_report,
        drawerAction = DrawerAction.BUG_REPORT
    )
)