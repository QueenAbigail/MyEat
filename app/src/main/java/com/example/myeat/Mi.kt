package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Mi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi)

        val pil = findViewById<ImageButton>(R.id.imageButton21)
            pil.setOnClickListener{
            val pilo = Intent (this,miaja::class.java)
            startActivity(pilo)
        }

        val pol = findViewById<ImageButton>(R.id.imageButton22)
            pol.setOnClickListener{
            val polo = Intent (this,mibaso::class.java)
            startActivity(polo)
        }

        val pul = findViewById<Button>(R.id.button5)
            pul.setOnClickListener{
            val pulo = Intent (this,Checkout::class.java)
            startActivity(pulo)
        }
    }
}