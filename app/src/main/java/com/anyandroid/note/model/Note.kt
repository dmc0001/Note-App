package com.anyandroid.note.model

import androidx.room.Entity


@Entity(tableName = "note_table")
data class Note (
    val title: String,
    val content: String
)