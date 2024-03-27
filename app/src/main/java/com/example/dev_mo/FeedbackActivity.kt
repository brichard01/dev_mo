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

        //On affiche le nom de celui qui donne le feedback
        var a = findViewById<TextView>(R.id.textView3)
        val name1 = intent.getStringExtra("name1")
        a.text = name1

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