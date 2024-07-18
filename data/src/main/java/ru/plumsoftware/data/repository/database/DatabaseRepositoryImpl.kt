package ru.plumsoftware.data.repository.database

import ru.plumsoftware.data.model.database.note.ImageRes
import ru.plumsoftware.data.model.database.note.Note
import ru.plumsoftware.data.model.database.note.NoteTask
import ru.plumsoftware.data.model.database.note.UserDatabase
import ru.plumsoftware.data.model.database.note.VideoRes

class DatabaseRepositoryImpl(private val userDatabase: UserDatabase) : DatabaseRepository {
    //    region::Query
    override suspend fun getAllNotes(): List<Note> {
        return userDatabase.noteDao().getAllNotes()
    }

    override suspend fun getAllNoteTasks(): List<NoteTask> {
        return userDatabase.noteDao().getAllNoteTasks()
    }

    override suspend fun getAllImageRes(): List<ImageRes> {
        return userDatabase.noteDao().getAllImageResIds()
    }

    override suspend fun getAllVideoRes(): List<VideoRes> {
        return userDatabase.noteDao().getAllVideoIds()
    }

    override suspend fun gelNoteById(id: Int): Note {
        return userDatabase.noteDao().getNoteById(id = id)
    }
//    endregion

    //    region::Insert
    override suspend fun insertNewNotes(vararg newNotes: Note) {
        userDatabase.noteDao().insetNewNotes(newNotes = newNotes)
    }

    override suspend fun insertNewNoteTasks(vararg newNoteTasks: NoteTask) {
        userDatabase.noteDao().insetNewNoteTasks(newNoteTasks = newNoteTasks)
    }

    override suspend fun insertNewImageRes(vararg imageRes: ImageRes) {
        userDatabase.noteDao().insetNewImageRes(newImageRes = imageRes)
    }

    override suspend fun insertNewVideoRes(vararg videoRes: VideoRes) {
        userDatabase.noteDao().insetNewVideoRes(newVideoRes = videoRes)
    }
//    endregion

    //    region::Delete
    override suspend fun deleteNotes(vararg notes: Note) {
        userDatabase.noteDao().deleteNotes(notes = notes)
    }

    override suspend fun deleteNoteTasks(vararg noteTasks: NoteTask) {
        userDatabase.noteDao().deleteNoteTasks(noteTasks = noteTasks)
    }

    override suspend fun deleteImageRes(vararg imageRes: ImageRes) {
        userDatabase.noteDao().deleteImageRes(imageRes = imageRes)
    }

    override suspend fun deleteNewVideoRes(vararg videoRes: VideoRes) {
        userDatabase.noteDao().deleteVideoRes(videoRes = videoRes)
    }
//    endregion
}