package ru.plumsoftware.notekeeper.presentation.screens.main.store

import ru.plumsoftware.notekeeper.data.model.DrawerAction

data class State(
    val queryToSearch: String = "",
    val drawerAction: DrawerAction = DrawerAction._3_DAYS,
)