package com.example.ethriftyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        val textView5 = findViewById<View>(R.id.textView5)
        textView5.setOnClickListener {
            val intent = Intent(this, Option::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}