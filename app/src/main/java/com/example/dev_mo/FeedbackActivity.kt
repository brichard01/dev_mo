package com.example.dev_mo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FeedbackActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        var a = findViewById<TextView>(R.id.textView3)
        val name1 = intent.getStringExtra("name1")
        val name2 = intent.getStringExtra("name2")
        a.text = name1

        val button = findViewById<Button>(R.id.buttonFB)
        button.setOnClickListener(){
            if (intent.getIntExtra("n", 1)==2){
                val name2 = intent.getStringExtra("name2")
                val intent = Intent(this, FeedbackActivity::class.java)
                intent.putExtra("name1", name2)
                startActivity(intent)
            }
        }
    }
}