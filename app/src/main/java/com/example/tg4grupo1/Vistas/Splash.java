package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.tg4grupo1.Bbdd.ModeloAdo;
import com.example.tg4grupo1.Modelo.Modelo;
import com.example.tg4grupo1.R;
import com.example.tg4grupo1.Utilidades.Metodos;

import java.util.ArrayList;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Metodos.descargarJson(this);
        Handler handler = new Handler(Looper.myLooper());
        handler.postDelayed(()->{
            Intent intent = new Intent(getApplicationContext(), Loging.class);
            startActivity(intent);
            finish();
        },5000);
    }
}