package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val button = findViewById<Button>(R.id.login1)
        val regis = findViewById<Button>(R.id.regis1)
        auth = FirebaseAuth.getInstance()

        Log.d("TAG", "onCreate: "+ auth.currentUser?.email.toString())

        if(auth.currentUser != null){
            startActivity(Intent(this,Mainmenu::class.java))
            finish()
        } else {
            progressBar.setVisibility(View.INVISIBLE)
            button.setOnClickListener {
                val intent = Intent(this,Login::class.java)
                startActivity(intent)
            }


            regis.setOnClickListener {
                val registrasi = Intent(this,Regis::class.java)
                startActivity(registrasi)
            }
        }
    }

    fun login(view: View) {}
    fun register(view: View) {}
}