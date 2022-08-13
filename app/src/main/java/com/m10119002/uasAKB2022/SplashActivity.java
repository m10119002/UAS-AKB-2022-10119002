package com.m10119002.uasAKB2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        (new Handler()).postDelayed(this::nextActivity, 5000);
    }

    private void nextActivity() {
        Intent intent = new Intent(SplashActivity.this, TentangActivity.class);
        startActivity(intent);
        finish();
    }
}