package com.example.myeat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class checkoutAdapter(private val Data:ArrayList<rowData>):RecyclerView.Adapter<checkoutAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): checkoutAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_checkout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: checkoutAdapter.ViewHolder, position: Int) {
        holder.bind(Data[position])
    }

    override fun getItemCount(): Int {
        return Data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nama = itemView.findViewById<TextView>(R.id.cNama)
        val jumlah = itemView.findViewById<TextView>(R.id.cJumlah)
        val harga = itemView.findViewById<TextView>(R.id.cHarga)
        fun bind(dataa:rowData){
            val hargaa = dataa.jumlah * dataa.harga
            nama.setText(dataa.nama)
            harga.setText(hargaa.toString())
            jumlah.setText(dataa.jumlah.toString())
        }
    }
}