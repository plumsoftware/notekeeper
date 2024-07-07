package ru.plumsoftware.data.model

data class Note(
    val id: Int,
    val name: String,
    val content: String?,
    val themeId: Int,
    val createDate: Long,
    val lastUpdateDate: Long,
    val imagesResIds: Array<Int> = emptyArray(),
    val videosResIds: Array<Int> = emptyArray(),
    val noteTasks: Array<NoteTask> = emptyArray()
) {
    companion object {
        fun empty(): Note {
            return Note(
                id = -1,
                name = "",
                content = "",
                themeId = -1,
                createDate = 0L,
                lastUpdateDate = 0L
            )
        }
    }
}
