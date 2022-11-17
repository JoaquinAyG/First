package com.study.fundaments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val bg  = findViewById<ImageView>(R.id.backgroundSpash)

        Glide.with(this)
                .load(R.drawable.gradient_img)
                .into(bg)

        bg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))

        openApp()

    }
    private fun openApp() {
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Splash, Login::class.java)
            startActivity(intent)
        }, 5000)
    }
}