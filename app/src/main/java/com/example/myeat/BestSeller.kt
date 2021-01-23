package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BestSeller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_seller)

        val pil = findViewById<ImageButton>(R.id.imageButton4)
            pil.setOnClickListener{
            val pilo = Intent (this,mcd::class.java)
            startActivity(pilo)
        }

        val pal = findViewById<ImageButton>(R.id.imageButton5)
            pal.setOnClickListener{
            val palo = Intent (this,Mi::class.java)
            startActivity(palo)
        }

        val psl = findViewById<ImageButton>(R.id.imageButton6)
        psl.setOnClickListener{
            val pslo = Intent (this,Marta::class.java)
            startActivity(pslo)
        }
    }
}