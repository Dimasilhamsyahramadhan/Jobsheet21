package com.example.jobsheet21

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class orangAdapter(private val list:ArrayList<Orang>): RecyclerView.Adapter<orangAdapter.orangViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): orangViewHolder {
        return orangViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }
    override fun onBindViewHolder(holder: orangViewHolder, position: Int) {
      holder.bind(list[position])
    }
    override fun getItemCount(): Int {
        return list.size
    }
    class orangViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.textDaftar)
        fun bind(get: Orang) {
            nama.text = get.nama
        }
    }
}