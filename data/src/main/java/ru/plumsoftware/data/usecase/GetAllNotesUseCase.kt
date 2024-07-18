package ru.plumsoftware.data.usecase

import ru.plumsoftware.data.repository.database.DatabaseRepository
import ru.plumsoftware.domain.model.ui.note.NoteUI

class GetAllNotesUseCase(private val databaseRepository: DatabaseRepository) {
    suspend fun execute() : List<NoteUI> {
        val allNotes = databaseRepository.getAllNotes()
        databaseRepository.
    }
}