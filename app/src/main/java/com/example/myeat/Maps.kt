package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_checkout.*
import kotlinx.android.synthetic.main.activity_maps.*

class Maps : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val total: String = intent.getIntExtra("total", 0).toString()
        textView14.setText("Rp. "+total)

        database = FirebaseDatabase.getInstance()
        auth = FirebaseAuth.getInstance()
        Log.d("TAG", "onCreate: "+auth.currentUser?.uid.toString())
        var databaseReference = database.getReference().child(auth.currentUser?.uid.toString())
        databaseReference.setValue(null)
        val pul = findViewById<Button>(R.id.button10)
        pul.setOnClickListener{
            val pulo = Intent (this,Sampai::class.java)
            startActivity(pulo)
        }
    }
}