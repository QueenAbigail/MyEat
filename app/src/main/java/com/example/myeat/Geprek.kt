package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Geprek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geprek)

        val pil = findViewById<ImageButton>(R.id.imageButton8)
        pil.setOnClickListener{
            val pilo = Intent (this,nomoz::class.java)
            startActivity(pilo)
        }

        val pol = findViewById<ImageButton>(R.id.imageButton9)
            pol.setOnClickListener{
            val polo = Intent (this,moza::class.java)
            startActivity(polo)
        }

        val pul = findViewById<Button>(R.id.button2)
            pul.setOnClickListener{
            val pulo = Intent (this,Checkout::class.java)
            startActivity(pulo)
        }
    }
}