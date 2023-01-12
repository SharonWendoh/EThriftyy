package com.example.ethriftyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button3 = findViewById<View>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, Option::class.java)
            // start your next activity
            startActivity(intent)
        }
        val button2 = findViewById<View>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, BuyersLandingActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }


}