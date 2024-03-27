package com.example.dev_mo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NameActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name2)

        val button = findViewById<Button>(R.id.buttonN2)
        button.setOnClickListener {
            val name1 = findViewById<EditText>(R.id.name1).text.toString()
            val name2 = findViewById<EditText>(R.id.name2).text.toString()
            val intent = Intent(this, FeedbackActivity::class.java)
            intent.putExtra("n", 2)
            intent.putExtra("name1", name1)
            intent.putExtra("name2", name2)
            startActivity(intent)
        }
    }
}