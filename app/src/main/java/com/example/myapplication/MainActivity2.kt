package com.example.myapplication

import Aceleracion
import Averiado
import Frenazo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import coche
import kotlin.random.Random


var coche1 = coche("jana",0,0,0)
var coche2 = coche ("Pepe",400,10,20);
var coche3 = coche ("Juan",300,20,20);
val resuladosp = mutableListOf<String>()
val resulados = mutableListOf<String>()
val list =  mutableListOf<coche>(coche1,coche2,coche3)
class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        var nombres: EditText



        lateinit var spinnerdeoperaciones: Spinner
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val info=  findViewById<Button>(R.id.empeza)
        info.setOnClickListener {
            val cambiandos = Intent(this, MainActivity3::class.java)
            startActivity(cambiandos)
        }

        val empieza=  findViewById<Button>(R.id.empeza)
        empieza.setOnClickListener {
            carrera()
        }

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

            nombres= findViewById(R.id.nombre)
            spinnerdeoperaciones.adapter = adapter
            spinnerdeoperaciones.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    when (arrayparaspinner[position]) {
                        "Ferrari 458" -> {
                            coche1 = coche("Juana",300, 30, 8 )
                        }
                        "Mclaren MSO X" -> {
                            coche1 = coche("jana",250, 40, 2)
                        }
                        "Porche CUP" -> {
                            coche1 = coche("jana",200, 35, 4)
                        }
                        "MClaren" -> {
                            coche1 = coche("jana",400, 50, 1)
                        }
                        "MClaren MSO Y" -> {
                            coche1 = coche("jana",450, 50, 4)
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }


        }

    }
    fun carrera (){


        var lamp = 0

        while (lamp <= 10) {
            for (i in 0..list.size - 1) {
                for (i in 0..list.size-1) {
                    list[i].velocidad += list[i].acc
                    list[i].distance =  list[i].velocidad
                    var aleatorio: Int = Random.nextInt(0, 4)

                    if (aleatorio == 0) {
                        Frenazo(list[i])
                    }
                    if (aleatorio == 1) {
                        Averiado(list[i])

                    }
                    if (aleatorio == 2) {
                     val explo = Intent(this, explocion::class.java)
                        startActivity(explo)
                        if (list.size == 1) {
                            lamp = 10
                        }
                    }
                    if (aleatorio == 3) {
                        Aceleracion(list[i])
                    }
                }
            }

            if (coche1.velocidad > coche2.velocidad && coche1.velocidad  > coche3.velocidad){
                resuladosp.add(coche1.nombre)
            }
            if (coche2.velocidad > coche1.velocidad && coche2.velocidad  > coche3.velocidad){
                resuladosp.add(coche2.nombre)
            }
            if (coche3.velocidad > coche1.velocidad && coche3.velocidad  >coche2.velocidad){
                resuladosp.add(coche3.nombre)
            }
            lamp++
        }
        if (coche1.velocidad >= coche2.velocidad && coche1.velocidad  >= coche3.velocidad){
            resulados.add(coche1.nombre)
        }
        if (coche2.velocidad >= coche1.velocidad && coche2.velocidad  >= coche3.velocidad){
            resulados.add(coche2.nombre)
        }
        if (coche3.velocidad >= coche1.velocidad && coche3.velocidad  >=coche2.velocidad){
            resulados.add(coche3.nombre)
        }

        if (coche1.velocidad > coche2.velocidad && coche1.velocidad  < coche3.velocidad){
            resulados.add(coche1.nombre)
        }
        if (coche2.velocidad > coche1.velocidad && coche2.velocidad  < coche3.velocidad){
            resulados.add(coche2.nombre)
        }
        if (coche3.velocidad > coche1.velocidad && coche3.velocidad  <coche2.velocidad){
            resulados.add(coche3.nombre)
        }

        if (coche1.velocidad  <=  coche2.velocidad && coche1.velocidad   <=  coche3.velocidad){
            resulados.add(coche1.nombre)
        }
        if (coche2.velocidad <=  coche1.velocidad && coche2.velocidad   <=  coche3.velocidad){
            resulados.add(coche2.nombre)
        }
        if (coche3.velocidad <=  coche1.velocidad && coche3.velocidad   <= coche2.velocidad){
            resulados.add(coche3.nombre)
        }





        val cambiando = Intent(this, podio::class.java)
        startActivity(cambiando)
    }
}
