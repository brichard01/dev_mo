package com.example.dev_mo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        //Nombre de participants (defaut 1)
        var nb = 1

        //Bouttons
        val buttonConfirm = findViewById<Button>(R.id.confirm)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)


        //Echange du nombre selectionné
        button1.setOnClickListener{
            nb = 1
            button1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            button2.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
        }

        button2.setOnClickListener{
            nb = 2
            button1.setBackgroundColor(ContextCompat.getColor(this, R.color.lightred))
            button2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }

        //Lorsqu'on confirme
        buttonConfirm.setOnClickListener {

            //On lance soit l'activité à une ou deux entrées
            if (nb==1){
                val intent = Intent(this, NameActivity::class.java)
                startActivity(intent)

            }else{
                val intent = Intent(this, NameActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}
