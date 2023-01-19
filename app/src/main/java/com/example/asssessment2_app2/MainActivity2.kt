package com.example.asssessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonClick = findViewById<Button>(R.id.CurrentWeather)
        buttonClick.setOnClickListener {
            val intent = Intent(this, com.example.asssessment2_app2.view.MainActivity::class.java)
            startActivity(intent)
        }
        val bottomSheetFragment = BottomSheetFragment()
        //Modal View to show instructions
        b2.setOnClickListener{
            bottomSheetFragment.show(supportFragmentManager, "BottomSheetDialog")
        }
    }
}