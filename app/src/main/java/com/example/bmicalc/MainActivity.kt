package com.example.bmicalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{

            val tfName = findViewById<TextView> (R.id.tfName)

            val intent = Intent(this, BMIcalc2::class.java)

            intent.putExtra("personName", tfName.text.toString())
            startActivity(intent)
        }
    }
}