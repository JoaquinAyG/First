package com.example.fundaments;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageView img = findViewById(R.id.girl);

        ImageView logo = findViewById(R.id.logo);

        Glide.with(this)
                .load("https://www.pngmart.com/files/21/Admin-Profile-Vector-PNG-Clipart.png")
                .circleCrop()
                .into(logo);

        Glide.with(this)
                //.load(R.drawable.girl)
                .load("https://miro.medium.com/max/4800/1*r2AuXvDuxdRWCqvmBhlssw.png")
                .centerCrop()
                .into(img);
        Button signupBut = findViewById(R.id.signup);
        Button cancelBut = findViewById(R.id.cancel);

        signupBut.setOnClickListener(view -> openSignUp());

        cancelBut.setOnClickListener(view -> super.onBackPressed());

    }

    private void openSignUp() {
        Intent i = new Intent(this, ActivitySignup.class);
        startActivity(i);
    }
}