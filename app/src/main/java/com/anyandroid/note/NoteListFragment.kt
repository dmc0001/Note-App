package com.anyandroid.note

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anyandroid.note.databinding.FragmentNoteListBinding
import com.anyandroid.note.model.Note
import com.anyandroid.note.viewModel.ViewModelNote




class NoteListFragment : Fragment() {

    //private val viewModel: ViewModelNote by viewModels()

    private lateinit var noteRecyclerView: RecyclerView
    private lateinit var noteAdapter: NoteAdapter
    private lateinit var binding : FragmentNoteListBinding

    companion object {
        fun newInstance() = NoteListFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteListBinding.inflate(inflater, container, false)
        noteRecyclerView = binding.noteRecyclerView

        val notes = arrayListOf(
            Note("Note 1", "This is the content of note 1"),
            Note("Note 2", "This is the content of note 2"),
            Note("Note 3", "This is the content of note 3")
        )
        noteAdapter = NoteAdapter(notes)
        noteRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        noteRecyclerView.adapter = noteAdapter
        Log.d("NoteListFragment", "Notes: $notes")

        return binding.root
    }
}
