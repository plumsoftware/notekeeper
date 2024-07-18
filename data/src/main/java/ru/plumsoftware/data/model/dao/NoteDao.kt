package ru.plumsoftware.data.model.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import ru.plumsoftware.data.model.database.Database
import ru.plumsoftware.data.model.database.note.ImageRes
import ru.plumsoftware.data.model.database.note.Note
import ru.plumsoftware.data.model.database.note.NoteTask
import ru.plumsoftware.data.model.database.note.VideoRes

@Dao
interface NoteDao {
    //    region::Query
    @Query("SELECT * FROM ${Database.NOTE_TABLE_NAME}")
    suspend fun getAllNotes(): List<Note>

    @Query("SELECT * FROM ${Database.TASKS_TABLE_NAME}")
    suspend fun getAllNoteTasks(): List<NoteTask>

    @Query("SELECT * FROM ${Database.IMAGE_RES_TABLE_NAME}")
    suspend fun getAllImageResIds(): List<ImageRes>

    @Query("SELECT * FROM ${Database.VIDEO_RES_TABLE_NAME}")
    suspend fun getAllVideoIds(): List<VideoRes>

    @Query("SELECT * FROM ${Database.NOTE_TABLE_NAME} WHERE ${Database.NOTE_ID}=:id")
    suspend fun getNoteById(id: Int): Note

    @Query("SELECT * FROM ${Database.TASKS_TABLE_NAME} WHERE ${Database.NOTE_ID}=:id")
    suspend fun getNoteTasksByNoteId(id: Int): List<NoteTask>

    @Query("SELECT * FROM ${Database.IMAGE_RES_TABLE_NAME} WHERE ${Database.NOTE_ID}=:id")
    suspend fun getImageResByNoteId(id: Int): List<ImageRes>

    @Query("SELECT * FROM ${Database.VIDEO_RES_TABLE_NAME} WHERE ${Database.NOTE_ID}=:id")
    suspend fun getVideoResByNoteId(id: Int): List<VideoRes>
//    endregion

    //    region:Insert
    @Insert(Note::class)
    suspend fun insetNewNotes(vararg newNotes: Note)

    @Insert(NoteTask::class)
    suspend fun insetNewNoteTasks(vararg newNoteTasks: NoteTask)

    @Insert(ImageRes::class)
    suspend fun insetNewImageRes(vararg newImageRes: ImageRes)

    @Insert(VideoRes::class)
    suspend fun insetNewVideoRes(vararg newVideoRes: VideoRes)
//    endregion

    //    region::Delete
    @Delete(Note::class)
    suspend fun deleteNotes(vararg notes: Note)

    @Delete(NoteTask::class)
    suspend fun deleteNoteTasks(vararg noteTasks: NoteTask)

    @Delete(ImageRes::class)
    suspend fun deleteImageRes(vararg imageRes: ImageRes)

    @Delete(VideoRes::class)
    suspend fun deleteVideoRes(vararg videoRes: VideoRes)
//    endregion
}