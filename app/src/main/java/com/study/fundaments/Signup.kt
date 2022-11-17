package com.study.fundaments

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val bg = findViewById<ImageView>(R.id.bg)
        bg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        val logInTxt = findViewById<TextView>(R.id.alredyHaveAccTxt)
        val cancelBut = findViewById<Button>(R.id.cancel)

        logInTxt.setOnClickListener { openLogIn() }
        cancelBut.setOnClickListener { super.onBackPressed() }
    }

    private fun openLogIn() {
        val intent = Intent(this, Login::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}