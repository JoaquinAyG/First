package com.example.fundaments

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivitySignup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val logInTxt = findViewById<TextView>(R.id.alredyHaveAccTxt)
        val cancelBut = findViewById<Button>(R.id.cancel)

        logInTxt.setOnClickListener { openLogIn() }
        cancelBut.setOnClickListener { super.onBackPressed() }
    }

    private fun openLogIn() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}