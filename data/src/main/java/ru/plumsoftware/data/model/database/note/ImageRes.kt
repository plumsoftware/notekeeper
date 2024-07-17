package ru.plumsoftware.data.model.database.note

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ImageRes (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo val resId: Int,
    @ColumnInfo val noteId: Int,
)