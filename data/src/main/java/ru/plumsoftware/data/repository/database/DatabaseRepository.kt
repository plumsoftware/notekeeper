package ru.plumsoftware.data.repository.database

import ru.plumsoftware.data.model.database.note.ImageRes
import ru.plumsoftware.data.model.database.note.Note
import ru.plumsoftware.data.model.database.note.NoteTask
import ru.plumsoftware.data.model.database.note.VideoRes

interface DatabaseRepository {
    suspend fun getAllNotes(): List<Note>
    suspend fun getAllNoteTasks(): List<NoteTask>
    suspend fun getAllImageRes(): List<ImageRes>
    suspend fun getAllVideoRes(): List<VideoRes>

    suspend fun insertNewNotes(vararg newNotes: Note)
    suspend fun insertNewNoteTasks(vararg newNoteTasks: NoteTask)
    suspend fun insertNewImageRes(vararg imageRes: ImageRes)
    suspend fun insertNewVideoRes(vararg videoRes: VideoRes)

    suspend fun deleteNotes(vararg notes: Note)
    suspend fun deleteNoteTasks(vararg noteTask: NoteTask)
    suspend fun deleteImageRes(vararg imageRes: ImageRes)
    suspend fun deleteNewVideoRes(vararg videoRes: VideoRes)
}