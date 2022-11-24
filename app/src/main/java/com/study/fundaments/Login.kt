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
                .load(R.drawable.profile)
                .circleCrop()
                .into(logo)

        Glide.with(this)
                .load(R.drawable.gradient_img)
                .centerCrop()
                .into(bg)
        bg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        val signupBut = findViewById<Button>(R.id.signup)

        val cancelBut = findViewById<Button>(R.id.cancel)

        signupBut.setOnClickListener { openSignUp() }

        cancelBut.setOnClickListener { super.onBackPressed() }

        val loginBut = findViewById<Button>(R.id.login)

        loginBut.setOnClickListener{
            val intent = Intent(this, Main::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

    }

    private fun openSignUp() {
        val i = Intent(this, Signup::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(i)
    }
}