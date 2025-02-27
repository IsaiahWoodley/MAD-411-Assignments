package com.example.isaiah_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val editTextView = findViewById<EditText>(R.id.editTextText)
        var outputName = findViewById<TextView>(R.id.outputNameTextView)

        submitButton.setOnClickListener{
            val name = editTextView.text
            outputName.text = "Hello $name!"
        }


        }
    }

