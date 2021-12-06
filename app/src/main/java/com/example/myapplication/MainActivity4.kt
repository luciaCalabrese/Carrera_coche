package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val podioprevio =  findViewById<TextView>(R.id.resultadosp)

       for(num in 0..resuladosp.size-1){
           podioprevio.text = resuladosp[num]
       }



        val handler = android.os.Handler()
        handler.postDelayed({
            val cambiando = Intent(this, podio::class.java)
            startActivity(cambiando)
        }, 4000)

    }


}