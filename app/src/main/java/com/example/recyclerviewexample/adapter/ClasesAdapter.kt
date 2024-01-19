package com.example.recyclerviewexample.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.Clases
import com.example.recyclerviewexample.R

class ClasesAdapter(private val listaClases:List<Clases>) : RecyclerView.Adapter<ClasesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClasesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            return ClasesViewHolder(layoutInflater.inflate(R.layout.item_clases, parent, false))
    }

    override fun getItemCount(): Int = listaClases.size

    override fun onBindViewHolder(holder: ClasesViewHolder, position: Int) {
        val item = listaClases[position]
        holder.render(item)
    }
}