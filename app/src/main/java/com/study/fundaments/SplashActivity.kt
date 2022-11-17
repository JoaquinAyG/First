package com.study.fundaments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import android.widget.ImageView


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var bg  = findViewById<ImageView>(R.id.backgroundSpash)


        Glide.with(this)
                .load(R.drawable.gradient_img)
                .into(bg)
    }
}