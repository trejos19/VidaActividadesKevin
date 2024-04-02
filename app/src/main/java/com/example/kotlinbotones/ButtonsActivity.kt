package com.example.kotlinbotones

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinbotones.databinding.ActivityButtonsBinding

const val TAG = "ButtonsActivity"

class ButtonsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityButtonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        //val Button1 = findViewById<Button>(R.id.containedButton)
        //val Button2 = findViewById<Button>(R.id.containedButton2)
        //val Button3 = findViewById<Button>(R.id.outlinedButton)
        //val Button4 = findViewById<Button>(R.id.outlinedButton2)
        //val Button5 = findViewById<Button>(R.id.textButton)
        //val Button6 = findViewById<Button>(R.id.textButton2)
        //val Button7 = findViewById<Button>(R.id.button1)
        //val Button8 = findViewById<Button>(R.id.button2)
        //val Button9 = findViewById<Button>(R.id.button3)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.containedButton.setOnClickListener(this)
        binding.containedButton2.setOnClickListener(this)
        binding.outlinedButton.setOnClickListener(this)
        binding.outlinedButton2.setOnClickListener(this)
        binding.textButton.setOnClickListener(this)
        binding.textButton2.setOnClickListener(this)
        binding.toggleButton.setOnClickListener(this)

        //Button1.setOnClickListener(this)
        //Button2.setOnClickListener(this)
        //Button3.setOnClickListener(this)
        //Button4.setOnClickListener(this)
        //Button5.setOnClickListener(this)
        //Button6.setOnClickListener(this)
        //Button7.setOnClickListener(this)
        //Button8.setOnClickListener(this)
        //Button9.setOnClickListener(this)
     Log.d("ButtonsActivity","Hola")
    }
    override fun onClick(view:View){
        when(view){
            binding.containedButton ->Toast.makeText(this,"Contained Button",Toast.LENGTH_LONG).show()
            binding.containedButton2->Toast.makeText(this,"Contained Button 2",Toast.LENGTH_LONG).show()
            binding.outlinedButton->Toast.makeText(this,"Outlined Button",Toast.LENGTH_LONG).show()
            binding.outlinedButton2->Toast.makeText(this,"Outlined Button 2",Toast.LENGTH_LONG).show()
            binding.textButton->Toast.makeText(this,"Text Button",Toast.LENGTH_LONG).show()
            binding.textButton2->Toast.makeText(this,"Text Button 2",Toast.LENGTH_LONG).show()
            binding.button1->Toast.makeText(this,"Toggle Button 1",Toast.LENGTH_LONG).show()
            binding.button2->Toast.makeText(this,"Toggle Button 2",Toast.LENGTH_LONG).show()
            binding.button3->Toast.makeText(this,"Toggle Button 3",Toast.LENGTH_LONG).show()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Iniciaron Los Botones")
    }
    override fun onResume() {
        super.onResume()
        // Imprimir mensaje en Logcat al resumir la actividad
        Log.d("ButtonActivity", "onResume en uso")
    }

    override fun onPause() {
        super.onPause()
        // Imprimir mensaje en Logcat al pausar la actividad
        Log.d("ButtonActivity", "onPause en uso")
    }

    override fun onStop() {
        super.onStop()
        // Imprimir mensaje en Logcat al detener la actividad
        Log.d("ButtonActivity", "onStop en uso")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Imprimir mensaje en Logcat al destruir la actividad
        Log.d("ButtonActivity", "onDestroy en uso")
    }

    override fun onRestart() {
        super.onRestart()
        // Imprimir mensaje en Logcat al reiniciar la actividad
        Log.d("ButtonActivity", "onRestart en uso")
    }
}