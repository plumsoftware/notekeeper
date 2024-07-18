package ru.plumsoftware.data.model.database.note

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class VideoRes (
    @PrimaryKey(autoGenerate = true) val _id : Int,
    @ColumnInfo val resId: Int,
    @ColumnInfo val noteId: Int
)