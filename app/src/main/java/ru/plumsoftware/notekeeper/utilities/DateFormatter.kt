package ru.plumsoftware.notekeeper.utilities

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun dateFormatter(date: Long, pattern: String) : String {
    return SimpleDateFormat(pattern, Locale.getDefault()).format(Date(date))
}