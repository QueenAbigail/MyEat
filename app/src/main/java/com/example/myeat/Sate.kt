package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Sate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sate)

        val pil = findViewById<ImageButton>(R.id.imageButton13)
            pil.setOnClickListener{
            val pilo = Intent (this,sateayam::class.java)
            startActivity(pilo)
        }

        val pol = findViewById<ImageButton>(R.id.imageButton14)
            pol.setOnClickListener{
            val polo = Intent (this,satekambing::class.java)
            startActivity(polo)
        }

        val pel = findViewById<ImageButton>(R.id.imageButton15)
        pel.setOnClickListener{
            val pelo = Intent (this,satesapi::class.java)
            startActivity(pelo)
        }

        val pul = findViewById<Button>(R.id.button3)
            pul.setOnClickListener{
            val pulo = Intent (this,Checkout::class.java)
            startActivity(pulo)
        }
    }
}