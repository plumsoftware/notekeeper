package ru.plumsoftware.data.model.database.note

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteTask(
    @PrimaryKey(autoGenerate = true) val noteTaskId: Int,
    @ColumnInfo val noteId: Int,
    @ColumnInfo val name: String,
    @ColumnInfo val isDone: Boolean
)
