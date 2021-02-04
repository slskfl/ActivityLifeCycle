package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNewAct, btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewAct=findViewById(R.id.btnNext);
        btnFinish=findViewById(R.id.btnFinish);
        android.util.Log.i("테스트","onCreate()메소드 수행.");
        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(intent);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("테스트","onStart()메소드 수행.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("테스트","onResume()메소드 수행.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("테스트","onPause()메소드 수행.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("테스트","onStop()메소드 수행.");
    }
}