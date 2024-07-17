package ru.plumsoftware.data.model.database.note

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.plumsoftware.data.model.dao.NoteDao

@Database(entities = [Note::class, NoteTask::class, ImageRes::class, VideoRes::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}