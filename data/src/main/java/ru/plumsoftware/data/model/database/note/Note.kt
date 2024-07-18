package ru.plumsoftware.data.model.database.note

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true) val noteId: Int,
    @ColumnInfo val name: String,
    @ColumnInfo val content: String?,
    @ColumnInfo val themeId: Int,
    @ColumnInfo val createDate: Long,
    @ColumnInfo val lastUpdateDate: Long,
) {
    companion object {
        fun empty(): Note {
            return Note(
                noteId = -1,
                name = "",
                content = "",
                themeId = -1,
                createDate = 0L,
                lastUpdateDate = 0L
            )
        }
    }
}
