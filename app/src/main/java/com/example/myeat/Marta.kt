package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Marta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marta)

        val pql = findViewById<ImageButton>(R.id.imageButton23)
            pql.setOnClickListener{
            val pqlo = Intent (this,manis::class.java)
            startActivity(pqlo)
        }

        val pwl = findViewById<ImageButton>(R.id.imageButton24)
            pwl.setOnClickListener{
            val pwlo = Intent (this,telor::class.java)
            startActivity(pwlo)
        }

        val pul = findViewById<Button>(R.id.button6)
            pul.setOnClickListener{
            val pulo = Intent (this,Checkout::class.java)
            startActivity(pulo)
        }
    }
}