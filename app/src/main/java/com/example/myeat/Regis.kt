package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_regis.*

class Regis : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)
        auth = FirebaseAuth.getInstance()

        val regis = findViewById<Button>(R.id.button)
            regis.setOnClickListener {

                auth.createUserWithEmailAndPassword(editTextTextPersonName3.text.toString().trim() + "@cancan.com",
                editTextTextPersonName4.text.toString().trim()).addOnCompleteListener(this){ task ->
                    if(task.isSuccessful){
                        startActivity(Intent(this, Mainmenu::class.java))
                        finish()
                    }
                }
            }

    }
}