package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class sateayam : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase
    private lateinit var auth: FirebaseAuth
    var counter = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sateayam)

        database = FirebaseDatabase.getInstance()
        auth = FirebaseAuth.getInstance()
        Log.d("TAG", "onCreate: "+auth.currentUser?.uid.toString())
        var databaseReference = database.getReference().child(auth.currentUser?.uid.toString()).child("sateayam")
        val pesan = findViewById<Button>(R.id.button9)
        pesan.setOnClickListener{
            databaseReference.child("nama").setValue("Sate Ayam")
            databaseReference.child("jumlah").setValue(counter)
            databaseReference.child("harga").setValue(22000)
            finish()
        }
    }
    fun increament(view: View) {

        counter++

        val txt = findViewById(R.id.textView4) as TextView
        txt.text = counter.toString()

    }
    fun decreament(view: View) {

        counter--

        val txt = findViewById(R.id.textView4) as TextView
        txt.text = counter.toString()

    }
}