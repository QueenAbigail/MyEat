package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Open : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open)

        val pil = findViewById<ImageButton>(R.id.imageButton7)
            pil.setOnClickListener{
            val pilo = Intent (this,mcd::class.java)
            startActivity(pilo)
        }
    }
}