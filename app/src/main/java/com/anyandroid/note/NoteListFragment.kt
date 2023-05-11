package com.anyandroid.note

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.anyandroid.note.databinding.FragmentNoteListBinding


class NoteListFragment : Fragment() {
    private lateinit var noteRecyclerView: RecyclerView
    private lateinit var noteAdapter: NoteAdapter
    lateinit var binding : FragmentNoteListBinding


    companion object {
        fun newInstance() = NoteListFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNoteListBinding.inflate(inflater, container, false)
        noteRecyclerView = binding.noteRecyclerView

        val notes = arrayListOf(
            Note("Note 1", "This is the content of note 1"),
            Note("Note 2", "This is the content of note 2"),
            Note("Note 3", "This is the content of note 3")
        )
        noteAdapter = NoteAdapter(notes)
        noteRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Set the adapter to the RecyclerView
        noteRecyclerView.adapter = noteAdapter
        Log.d("NoteListFragment", "Notes: $notes")

        return binding.root
    }

}