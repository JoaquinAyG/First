package com.example.fundaments;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signUpText = findViewById(R.id.signUpText);
        Button cancelBut = findViewById(R.id.cancel);

        signUpText.setOnClickListener(view -> openSignUp());

        cancelBut.setOnClickListener(view -> super.onBackPressed());

    }

    private void openSignUp() {
        Intent i = new Intent(this, ActivitySignup.class);
        startActivity(i);
    }
}