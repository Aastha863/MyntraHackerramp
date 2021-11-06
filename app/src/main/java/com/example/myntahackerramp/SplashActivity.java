package com.example.myntahackerramp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }
    public void gotoMain(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
