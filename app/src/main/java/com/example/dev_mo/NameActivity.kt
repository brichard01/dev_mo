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

        //En appuyant sur le bouton
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //On recupere le nom
            val name = findViewById<EditText>(R.id.name).text.toString()

            val intent = Intent(this, FeedbackActivity::class.java)
            //Nombre de feedback a lancer (1)
            intent.putExtra("n", 1)

            //On transfert les noms
            intent.putExtra("name1", name)

            //On lance le feedback
            startActivity(intent)
        }
    }
}