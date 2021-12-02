package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import coche

class MainActivity2 : AppCompatActivity() {

    var coche2 = coche (400,10,20);
    var coche3 = coche (300,20,20);
    val list =  mutableListOf<coche>(coche1,coche2,coche3)
    lateinit var coche1: coche

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var spinnerdeoperaciones: Spinner
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val empieza=  findViewById<Button>(R.id.empeza)

        empieza.setOnClickListener {

            val cambiando = Intent(this, Presentacion::class.java)

            startActivity(cambiando)

        }
        val prueba=  findViewById<Button>(R.id.infoCoche)

//        prueba.setOnClickListener {
//
//            val cambiando = Intent(this, historia::class.java)
//
//            startActivity(cambiando)
//
//        }

        spinnerdeoperaciones = findViewById(R.id.spinner)




        val arrayparaspinner = mutableListOf<String>(
            "Elige:",
            "Ferrari 458",
            "Mclaren MSO X",
            "Porche CUP",
            "MClaren",
            "MClaren MSO Y"
        )

        if (spinnerdeoperaciones != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, arrayparaspinner
            )
            spinnerdeoperaciones.adapter = adapter
            spinnerdeoperaciones.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    when (arrayparaspinner[position]) {
                        "Ferrari 458" -> {
                            coche1 = coche(300, 30, 8 )
                        }
                        "Mclaren MSO X" -> {
                            coche1 = coche(250, 40, 2)
                        }
                        "Porche CUP" -> {
                            coche1 = coche(200, 35, 4)
                        }
                        "MClaren" -> {
                            coche1 = coche(400, 50, 1)
                        }
                        "MClaren MSO Y" -> {
                            coche1 = coche(450, 50, 4)
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }

        }
//        val empezar = findViewById<Button>(R.id.empeza)
//
//
//        empezar.setOnClickListener {
////            var race1 = Race(100,1)
////            race1.start(coche1)
//        }
    }
}