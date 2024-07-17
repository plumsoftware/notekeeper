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
        TODO("Not yet implemented")
    }

    override suspend fun getAllImageRes(): List<ImageRes> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllVideoRes(): List<VideoRes> {
        TODO("Not yet implemented")
    }
//    endregion

    //    region::Insert
    override suspend fun insertNewNotes(vararg newNotes: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun insertNewNoteTasks(vararg newNoteTasks: NoteTask) {
        TODO("Not yet implemented")
    }

    override suspend fun insertNewImageRes(vararg imageRes: ImageRes) {
        TODO("Not yet implemented")
    }

    override suspend fun insertNewVideoRes(vararg videoRes: VideoRes) {
        TODO("Not yet implemented")
    }
//    endregion

    //    region::Delete
    override suspend fun deleteNotes(vararg notes: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNoteTasks(vararg noteTask: NoteTask) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteImageRes(vararg imageRes: ImageRes) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNewVideoRes(vararg videoRes: VideoRes) {
        TODO("Not yet implemented")
    }
//    endregion
}