package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;

import com.example.tg4grupo1.R;

public class Main extends AppCompatActivity {
    Button iniciar;
    EditText usuario;
    EditText contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iniciar = findViewById(R.id.bntInicioSesion);
        usuario = findViewById(R.id.tNombre);
        contrasena = findViewById(R.id.editTextTextPassword);

        iniciar.setOnClickListener(v->{
            if(!usuario.getText().toString().equals("usuario") ){

            }else if(!contrasena.getText().toString().equals("admin") ){

            }else{
                /*Intent intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
                finish();*/            }
        });
    }
}