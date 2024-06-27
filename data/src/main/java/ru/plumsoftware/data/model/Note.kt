package ru.plumsoftware.data.model

data class Note(
    val name: String,
    val content: String?,
    val color: Int,
    val imagesResIds: Array<Int> = emptyArray(),
    val videosResIds: Array<Int> = emptyArray()
)
