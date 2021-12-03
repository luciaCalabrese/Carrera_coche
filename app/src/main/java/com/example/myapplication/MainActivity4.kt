package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)



        val handler = android.os.Handler()
        handler.postDelayed({
            val cambiando = Intent(this, MainActivity2::class.java)
            startActivity(cambiando)
        }, 1000)

    }


}