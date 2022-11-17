package com.study.fundaments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.bumptech.glide.Glide
import android.widget.ImageView


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val bg  = findViewById<ImageView>(R.id.backgroundSpash)

        bg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))

        Glide.with(this)
                .load(R.drawable.gradient_img)
                .into(bg)
    }
}