package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class podio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podio)

        val Compwhap =  findViewById<Button>(R.id.compartir)
        val primero =  findViewById<TextView>(R.id.primero)
        val segundo=  findViewById<TextView>(R.id.segundo)
        val tercero =  findViewById<TextView>(R.id.tercero)

        Compwhap.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.setAction(Intent.ACTION_SEND)
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Primer puesto : ${resulados[resulados.size-1]}  Segundo puesto: ${resulados[resulados.size-2]} Tercer puesto: ${resulados[resulados.size-1]}" )
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }

        val inicio =  findViewById<Button>(R.id.button)
            inicio.setOnClickListener {
            val cambiando = Intent(this, MainActivity::class.java)
            startActivity(cambiando)
        }

        tercero.text = resulados[resulados.size-1]
        segundo.text = resulados[resulados.size-2]
        primero.text = resulados[resulados.size-3]
    }
}