package com.example.taskmate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskmate.databinding.ActivityMainBinding // Import your binding class here

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Declare your binding variable here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }
    }
}
