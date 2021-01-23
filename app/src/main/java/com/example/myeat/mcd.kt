package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class mcd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mcd)

        val pil = findViewById<ImageButton>(R.id.imageButton16)
            pil.setOnClickListener{
            val pilo = Intent (this,ayam::class.java)
            startActivity(pilo)
        }

        val pol = findViewById<ImageButton>(R.id.imageButton17)
            pol.setOnClickListener{
            val polo = Intent (this,kentang::class.java)
            startActivity(polo)
        }

        val pel = findViewById<ImageButton>(R.id.imageButton18)
            pel.setOnClickListener{
            val pelo = Intent (this,burger::class.java)
            startActivity(pelo)
        }

        val pql = findViewById<ImageButton>(R.id.imageButton19)
            pql.setOnClickListener{
            val pqlo = Intent (this,icecream::class.java)
            startActivity(pqlo)
        }

        val pwl = findViewById<ImageButton>(R.id.imageButton20)
            pwl.setOnClickListener{
            val pwlo = Intent (this,cocacola::class.java)
            startActivity(pwlo)
        }

        val pul = findViewById<Button>(R.id.button4)
            pul.setOnClickListener{
            val pulo = Intent (this,Checkout::class.java)
            startActivity(pulo)
        }
    }
}