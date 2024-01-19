package com.example.recyclerviewexample.modulos.listado

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.ClasesProvider
import com.example.recyclerviewexample.adapter.ClasesAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp

class CardViewsClases: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FirebaseApp.initializeApp(this)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerBailes.layoutManager = manager
        binding.recyclerBailes.adapter = ClasesAdapter(ClasesProvider.listaClases)
        binding.recyclerBailes.addItemDecoration(decoration)
    }
}