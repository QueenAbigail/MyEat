package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val editText2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        auth = FirebaseAuth.getInstance()

        val login2 = findViewById<Button>(R.id.login2)
            login2.setOnClickListener {

                auth.signInWithEmailAndPassword(editText.text.toString().trim()+ "@cancan.com", editText2.text.toString())
                    .addOnCompleteListener(this){ task ->
                        if(task.isSuccessful){
                            val log = Intent(this,Mainmenu::class.java)
                            startActivity(log)
                            finish()
                        } else {
                            Toast.makeText(
                                this,
                                "pastikan isi data dengan benar",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            }

        val regis2 = findViewById<TextView>(R.id.textView)
            regis2.setOnClickListener {
                val reg = Intent(this,Regis::class.java)
                startActivity(reg)
            }
    }

}