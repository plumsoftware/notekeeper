package ru.plumsoftware.domain.model.ui.note

data class NoteUI(
    val id: Int,
    val name: String,
    val content: String?,
    val themeId: Int,
    val createDate: Long,
    val lastUpdateDate: Long,
    val noteTasks: Array<NoteTaskUI> = arrayOf(),
    val imageResIds: Array<ImageResUI> = arrayOf(),
    val videoResIds: Array<VideoResUI> = arrayOf(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NoteUI

        if (id != other.id) return false
        if (name != other.name) return false
        if (content != other.content) return false
        if (themeId != other.themeId) return false
        if (createDate != other.createDate) return false
        if (lastUpdateDate != other.lastUpdateDate) return false
        if (!noteTasks.contentEquals(other.noteTasks)) return false
        if (!imageResIds.contentEquals(other.imageResIds)) return false
        if (!videoResIds.contentEquals(other.videoResIds)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + (content?.hashCode() ?: 0)
        result = 31 * result + themeId
        result = 31 * result + createDate.hashCode()
        result = 31 * result + lastUpdateDate.hashCode()
        result = 31 * result + noteTasks.contentHashCode()
        result = 31 * result + imageResIds.contentHashCode()
        result = 31 * result + videoResIds.contentHashCode()
        return result
    }
}
