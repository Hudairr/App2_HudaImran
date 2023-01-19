package com.example.asssessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonClick = findViewById<Button>(R.id.CurrentWeather)
        buttonClick.setOnClickListener {
            val intent = Intent(this, com.example.asssessment2_app2.view.MainActivity::class.java)
            startActivity(intent)
        }
    }
}