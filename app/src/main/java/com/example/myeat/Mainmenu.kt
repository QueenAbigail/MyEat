package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.google.firebase.auth.FirebaseAuth

class Mainmenu : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        auth = FirebaseAuth.getInstance()

        val dekat = findViewById<ImageButton>(R.id.imageButton)
            dekat.setOnClickListener {
                val terdekat = Intent(this,Terdekat::class.java)
                startActivity(terdekat)
            }

        val best = findViewById<ImageButton>(R.id.imageButton2)
            best.setOnClickListener {
                val seller = Intent(this,BestSeller::class.java)
                startActivity(seller)
            }

        val hour = findViewById<ImageButton>(R.id.imageButton3)
        hour.setOnClickListener {
            val jam = Intent(this,Open::class.java)
            startActivity(jam)
        }
    }

    fun logout(view: View) {
        auth.signOut()
        startActivity(Intent(this, MainActivity::class.java))
    }
}