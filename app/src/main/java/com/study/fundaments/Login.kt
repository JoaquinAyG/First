package com.study.fundaments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import android.content.Intent
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bg = findViewById<ImageView>(R.id.bg)

        val logo = findViewById<ImageView>(R.id.logo)

        Glide.with(this)
                .load("https://www.pngmart.com/files/21/Admin-Profile-Vector-PNG-Clipart.png")
                .circleCrop()
                .into(logo)

        Glide.with(this) //.load(R.drawable.girl)
                .load("https://miro.medium.com/max/4800/1*r2AuXvDuxdRWCqvmBhlssw.png")
                .centerCrop()
                .into(bg)

        Glide.with(this)
                .load(R.drawable.gradient_img)
                .centerCrop()
                .into(bg)
        bg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        val signupBut = findViewById<Button>(R.id.signup)

        val cancelBut = findViewById<Button>(R.id.cancel)

        signupBut.setOnClickListener { openSignUp() }

        cancelBut.setOnClickListener { super.onBackPressed() }
    }

    private fun openSignUp() {
        val i = Intent(this, Signup::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(i)
    }
}