package com.example.myeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_checkout.*
import java.lang.NumberFormatException

class Checkout : AppCompatActivity() {
    private val list = ArrayList<rowData>()
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        var hargatotal: Int = 0
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        var databaseReference = database.getReference().child(auth.currentUser?.uid.toString())
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
               if(dataSnapshot.hasChildren()) {
                   for (ds in dataSnapshot.children) {
                       list.add(rowData(ds.child("nama").getValue().toString(), ds.child("jumlah").getValue().toString().toInt(), ds.child("harga").getValue().toString().toInt()))
                       hargatotal += ds.child("jumlah").getValue().toString().toInt() * ds.child("harga").getValue().toString().toInt();
                       textView30.setText("Total Harga : " + hargatotal.toString())
                   }
                   rvCheckout.adapter?.notifyDataSetChanged()
               }
                progressBar2.visibility = View.INVISIBLE
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message

                // ...
            }
        }

        Log.d("TAG", "onDataChange: Jalan")
        databaseReference.addValueEventListener(postListener)
        rvCheckout.layoutManager = LinearLayoutManager(this)
        rvCheckout.adapter = checkoutAdapter(list)

        val pul = findViewById<Button>(R.id.button11)
        pul.setOnClickListener {
            val pulo = Intent(this, Maps::class.java)
            pulo.putExtra("total", hargatotal)
            startActivity(pulo)
            finish()
        }
    }
}