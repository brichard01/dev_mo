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

        //En appuyant sur le bouton
        val button = findViewById<Button>(R.id.buttonN2)
        button.setOnClickListener {
            //On recupere les noms
            val name1 = findViewById<EditText>(R.id.name1).text.toString()
            val name2 = findViewById<EditText>(R.id.name2).text.toString()


            val intent = Intent(this, FeedbackActivity::class.java)
            //Nombre de feedback a lancer (2)
            intent.putExtra("n", 2)

            //On transfert les noms
            intent.putExtra("name1", name1)
            intent.putExtra("name2", name2)

            //On lance le feedback
            startActivity(intent)
        }
    }
}