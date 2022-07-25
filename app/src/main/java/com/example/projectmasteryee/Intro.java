package com.example.projectmasteryee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //추후 model 데이터가 클 수 있어서 인트로 화면 생성 현재는 1초 뒤 화면 넘김
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Intro.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },1000);
    }
}