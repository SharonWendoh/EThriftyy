package com.example.ethriftyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Option : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        val button5 = findViewById<View>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            // start your next activity
            startActivity(intent)
        }
        val button6 = findViewById<View>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this, BuyersSignUp::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}