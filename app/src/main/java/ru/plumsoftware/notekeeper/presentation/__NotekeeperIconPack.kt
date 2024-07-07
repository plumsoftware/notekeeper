package ru.plumsoftware.notekeeper.presentation

import androidx.compose.ui.graphics.vector.ImageVector
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Calendar3
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Clock
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Film
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Image
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.MenuIcon
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Paperclip
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Search
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Star
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.Trash2
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.X
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Bell-fill`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Bug-fill`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Calendar-range`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Calendar-week`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Chevron-down`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Chevron-left-1`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Chevron-left-2`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Chevron-left`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Folder2-open`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Gear-wide`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`Star-half`
import ru.plumsoftware.notekeeper.presentation.notekeepericonpack.`X-1`
import kotlin.collections.List as ____KtList

public object NotekeeperIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val NotekeeperIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(`Bell-fill`, `Bug-fill`, `Calendar-range`, `Calendar-week`, Calendar3,
        `Chevron-down`, `Chevron-left-1`, `Chevron-left-2`, `Chevron-left`, Clock, Film,
        `Folder2-open`, `Gear-wide`, Image, MenuIcon, Paperclip, Search, `Star-half`, Star, Trash2,
        `X-1`, X)
    return __AllIcons!!
  }
