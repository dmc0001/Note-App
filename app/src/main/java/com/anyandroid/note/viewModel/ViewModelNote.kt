package com.anyandroid.note.viewModel



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anyandroid.note.model.Note
import java.io.Closeable


class ViewModelNote() : ViewModel(){

    private val _notes = MutableLiveData<List<Note>>()
    val notes: LiveData<List<Note>> = _notes

    init {
        loadNotes()
    }

    private fun loadNotes() {
        // Simulate loading notes from a data source (e.g., a database or network)
        val notesData = listOf(
            Note("Note 1", "This is the content of note 1"),
            Note("Note 2", "This is the content of note 2"),
            Note("Note 3", "This is the content of note 3")
        )
        _notes.postValue(notesData)
    }
}