package com.example.recyclerviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewexample.modulos.autentificacion.AutenticationActivity
import com.example.recyclerviewexample.modulos.listado.CardViewsClases

class MainActivity : AppCompatActivity() {

    private var isLogged: Boolean = false

    override fun onResume() {
        super.onResume()
        if(isLogged) {
            val intent = Intent(this, CardViewsClases::class.java)
            startActivity(intent)
        }else{
            val intent = Intent(this, AutenticationActivity::class.java)
            startActivity(intent)
        }
    }
}