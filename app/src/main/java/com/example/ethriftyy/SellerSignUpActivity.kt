package com.example.ethriftyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SellerSignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_sign_up)

        val button4 = findViewById<View>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, SellersLandingActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}