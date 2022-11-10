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

        Glide.with(this)
                //.load(R.drawable.girl)
                .load("https://miro.medium.com/max/4800/1*r2AuXvDuxdRWCqvmBhlssw.png")
                .centerCrop()
                .into(img);
        TextView signUpText = findViewById(R.id.signUpText);
        Button cancelBut = findViewById(R.id.cancel);

        signUpText.setOnClickListener(view -> openSignUp());
        cancelBut.setOnClickListener(view -> super.onBackPressed());

    }

    private void openSignUp() {
        Intent i = new Intent(this, ActivitySignup.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }
}