package com.example.dev_mo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NameActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val name = findViewById<EditText>(R.id.name).text.toString()
            val intent = Intent(this, FeedbackActivity::class.java)
            intent.putExtra("n", 1)
            intent.putExtra("name1", name)
            startActivity(intent)
        }
    }
}