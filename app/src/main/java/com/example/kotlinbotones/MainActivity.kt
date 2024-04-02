package com.example.kotlinbotones

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val btnWelcome = findViewById<Button>(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            Toast.makeText(this@MainActivity, "Bienvenido", Toast.LENGTH_SHORT).show()
            // Iniciar la segunda actividad
            val intent = Intent(this@MainActivity, ButtonsActivity::class.java)
            startActivity(intent)
        }
    }
}