package com.example.taskmate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskmate.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding
    private lateinit var db: NoteDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = NoteDatabaseHelper(this)

        binding.saveButton.setOnClickListener {
            val title = binding.titleEditText.text.toString()
            val content = binding.contentEditText.text.toString()

            // Assuming you have a method in NoteDatabaseHelper to insert the note
            // Example: db.insertNote(title, content)
            // You need to implement the insertNote method in NoteDatabaseHelper
            // to store the note in the database
        }
    }
}
