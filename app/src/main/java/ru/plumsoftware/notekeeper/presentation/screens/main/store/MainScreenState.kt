package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.notekeeper.data.model.DrawerAction
import ru.plumsoftware.notekeeper.data.model.DrawerItem
import ru.plumsoftware.notekeeper.data.model.list

data class MainScreenState(
    val queryToSearch: String = "",
    val drawerAction: DrawerAction = DrawerAction._3_DAYS,
    val drawerList: List<DrawerItem> = list
)