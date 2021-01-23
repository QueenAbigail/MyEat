package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sampai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sampai)

        val pul = findViewById<Button>(R.id.button12)
        pul.setOnClickListener{
            val pulo = Intent (this,Mainmenu::class.java)
            startActivity(pulo)
        }
    }
}