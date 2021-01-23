package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageButton

class Terdekat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terdekat)

        val pol = findViewById<ImageButton>(R.id.imageButton10)
            pol.setOnClickListener{
                val polo = Intent (this,Geprek::class.java)
                startActivity(polo)
            }

        val pil = findViewById<ImageButton>(R.id.imageButton11)
            pil.setOnClickListener{
            val pilo = Intent (this,Sate::class.java)
            startActivity(pilo)
        }

        val pul = findViewById<ImageButton>(R.id.imageButton12)
            pul.setOnClickListener{
            val pulo = Intent (this,mcd::class.java)
            startActivity(pulo)
        }
    }
}