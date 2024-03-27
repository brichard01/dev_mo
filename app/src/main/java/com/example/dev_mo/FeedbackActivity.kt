package com.example.dev_mo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class FeedbackActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        //On affiche le nom de celui qui donne le feedback
        var a = findViewById<TextView>(R.id.textView3)
        val name1 = intent.getStringExtra("name1")
        a.text = name1

        //Gestion du bouton selectionne
        val di1 = findViewById<Button>(R.id.buttonDi1)
        val di2 = findViewById<Button>(R.id.buttonDi2)
        val di3 = findViewById<Button>(R.id.buttonDi3)
        val do1 = findViewById<Button>(R.id.buttonDo1)
        val do2 = findViewById<Button>(R.id.buttonDo2)
        val do3 = findViewById<Button>(R.id.buttonDo3)

        di1.setOnClickListener{
            di1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            di2.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            di3.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
        }

        di2.setOnClickListener{
            di1.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            di2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            di3.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
        }

        di3.setOnClickListener{
            di1.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            di2.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            di3.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }

        do1.setOnClickListener{
            do1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            do2.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            do3.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
        }

        do2.setOnClickListener{
            do1.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            do2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            do3.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
        }

        do3.setOnClickListener{
            do1.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            do2.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            do3.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }

        //Lorsqu'on appuie sur le bouton
        val button = findViewById<Button>(R.id.buttonFB)
        button.setOnClickListener(){
            //On regarde si il faut lancer un deuxieme feedback
            if (intent.getIntExtra("n", 1)==2){

                //On recupere le deuxieme prenom
                val name2 = intent.getStringExtra("name2")

                //On relance une fois avec le deuxieme prenom
                val intent = Intent(this, FeedbackActivity::class.java)
                intent.putExtra("n", 1)
                intent.putExtra("name1", name2)
                startActivity(intent)
            }
            //Sinon on retourne au début
            else{
                val intent = Intent(this, InfoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}