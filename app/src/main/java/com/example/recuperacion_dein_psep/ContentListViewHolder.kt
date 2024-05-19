package com.example.recuperacion_dein_psep

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ContentAdapter () : RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val row: View = LayoutInflater.from(parent.context).inflate(R.layout.content_item, parent, false)
        return ViewHolder(row)
    }

    override fun getItemCount() = zonas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val zona = zonas[position]
        holder.bindRow(zona)
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bindRow(zona: Zona) {

        }

    }


}