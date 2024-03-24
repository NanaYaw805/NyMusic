package com.ulimited.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        installSplashScreen();
        //Handling the splash screen transition here

    }

    private void installSplashScreen() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent exitSplashscreen = new Intent(SplashScreenActivity.this, RegistrationActivity.class);
                startActivity(exitSplashscreen);
            }
        },3000);


    }
}