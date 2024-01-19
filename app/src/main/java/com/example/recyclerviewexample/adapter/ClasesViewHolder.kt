package com.example.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.Clases

import com.example.recyclerviewexample.databinding.ItemClasesBinding

class ClasesViewHolder (view: View): RecyclerView.ViewHolder(view){

    val binding = ItemClasesBinding.bind(view)

    fun render(clasesModel: Clases){
        binding.tvHorarios.text = clasesModel.horarios
        binding.tvProfesores.text = clasesModel.profesores
        binding.tvBailes.text = clasesModel.bailes
        Glide.with(binding.ivFotos.context).load(clasesModel.foto).into(binding.ivFotos)

        binding.ivFotos.setOnClickListener{
            Toast.makeText(
                binding.ivFotos.context,
                clasesModel.bailes,
                Toast.LENGTH_SHORT
            ).show()
        }

        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivFotos.context,
                clasesModel.bailes,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}