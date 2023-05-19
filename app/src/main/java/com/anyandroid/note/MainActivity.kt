package com.anyandroid.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.anyandroid.note.viewModel.ViewModelNote

class MainActivity : AppCompatActivity() {
    private val viewModel: ViewModelNote by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}