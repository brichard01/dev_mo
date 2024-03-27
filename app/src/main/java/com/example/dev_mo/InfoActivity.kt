package com.example.dev_mo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        var nb = 1

        //Bouttons

        val buttonConfirm = findViewById<Button>(R.id.confirm)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        //Listeners

        button1.setOnClickListener{
            nb = 1
            button1.setBackgroundColor(0)
            button2.setBackgroundColor(1)
        }

        button2.setOnClickListener{
            nb = 2
            button1.setBackgroundColor(1)
            button2.setBackgroundColor(0)
        }

        buttonConfirm.setOnClickListener {
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