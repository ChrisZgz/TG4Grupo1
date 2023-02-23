package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;

import com.example.tg4grupo1.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler handler = new Handler(Looper.myLooper());
        handler.postDelayed(()->{
            Intent intent = new Intent(getApplicationContext(), Main.class);
            startActivity(intent);
        },5000);
    }
}