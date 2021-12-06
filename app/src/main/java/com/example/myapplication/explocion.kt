package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class explocion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explocion)

        val handler = android.os.Handler()
        handler.postDelayed({
            val cambiando = Intent(this, MainActivity2::class.java)
            startActivity(cambiando)
        }, 1000)
    }
}