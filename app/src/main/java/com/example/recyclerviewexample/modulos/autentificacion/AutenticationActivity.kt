package com.example.recyclerviewexample.modulos.autentificacion

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.modulos.autentificacion.fragments.LoginFragment
import com.example.recyclerviewexample.modulos.autentificacion.fragments.LoginFragmentListener
import com.example.recyclerviewexample.modulos.listado.CardViewsClases

class AutenticationActivity : AppCompatActivity(), LoginFragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autentication)
        var fragmento = LoginFragment()
        fragmento.setListener(this)
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragmento).commit()

    }

    override fun didLoginSuccess() {
        val intent = Intent(this, CardViewsClases::class.java)
        startActivity(intent)
    }
}