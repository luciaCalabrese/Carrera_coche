package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ferrar =  findViewById<Button>(R.id.infoCoche)

        ferrar.setOnClickListener {

            val cambiando = Intent(this, MainActivity3::class.java)

            startActivity(cambiando)

        }
        val datos =  findViewById<Button>(R.id.carrera)

        datos.setOnClickListener {

            val cambiando = Intent(this, MainActivity2::class.java)

            startActivity(cambiando)

        }
    }
}