package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnReturn=findViewById(R.id.btnReturn);

        android.util.Log.i("테스트","Result onCreate()메소드 수행.");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}