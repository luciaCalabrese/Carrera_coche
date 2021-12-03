package com.example.myapplication

import Aceleracion
import Averiado
import Frenazo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import carreras
import coche
import kotlin.random.Random


var coche1 = coche(0,0,0)
var coche2 = coche (400,10,20);
var coche3 = coche (300,20,20);
class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var spinnerdeoperaciones: Spinner
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val empieza=  findViewById<Button>(R.id.empeza)

        empieza.setOnClickListener {

            val cambiando = Intent(this, MainActivity4::class.java)
            carrera()

            startActivity(cambiando)

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

    }
    fun carrera (){
        val list =  mutableListOf<coche>(coche1,coche2,coche3)
        var lamp = 0



        while (lamp <= 10) {

            for (i in 0..list.size - 1) {
                for (i in 0..list.size-1) {
                    list[i].velocidad += list[i].acc
                    var aleatorio: Int = Random.nextInt(0, 4)

                    if (aleatorio == 0) {
                        Frenazo(list[i])
                    }
                    if (aleatorio == 1) {
                        Averiado(list[i])
                        if (list.size - 1 <= 1) {
                            lamp = 10
                        }
                    }
                    if (aleatorio == 2) {
                        if (list.size == 1) {
                            lamp = 10
                        }
                    }
                    if (aleatorio == 3) {
                        Aceleracion(list[i])
                    }
                }
            }
            lamp++
        }


        System.out.println("------------------")
        if (coche1.velocidad >= coche2.velocidad && coche1.velocidad >= coche3.velocidad ) {
            System.out.println("El ganador es: coche1 " + coche1.velocidad)
        }
        if (coche1.velocidad <= coche2.velocidad && coche2.velocidad >= coche3.velocidad ) {
            System.out.println("El ganador es: coche2 " + coche2.velocidad)
        }
        if (coche3.velocidad >= coche1.velocidad && coche2.velocidad <= coche3.velocidad ) {
            System.out.println("El ganador es coche3 " + coche3.velocidad)
        }

        System.out.println(coche1.velocidad)
        System.out.println(coche2.velocidad)
        System.out.println(coche3.velocidad)
    }
}