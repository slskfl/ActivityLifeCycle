package com.example.splashactivityex1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar bar=getSupportActionBar();
        bar.hide();

        Handler handler=new Handler();
        //지연시키는 메서드
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },3000);
    }
}