package com.example.ethriftyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BuyersSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyers_sign_up)

        val button7 = findViewById<View>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, BuyersLandingActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}