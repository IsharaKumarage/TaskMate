package com.example.taskmate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskmate.databinding.ActivityAddNoteBinding

abstract class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding // Change to correct binding class
    private lateinit var db: NoteDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = NoteDatabaseHelper(this)

        binding.saveButton.setOnClickListener {
            val title = binding.titleEditText.text.toString()
            val content = binding.contentEditText.text.toString()
            // Now you can use title and content as needed
        }
    }

}
