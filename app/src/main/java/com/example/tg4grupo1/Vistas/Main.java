package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tg4grupo1.R;

import org.w3c.dom.Text;

public class Main extends AppCompatActivity {
    Button iniciar;
    EditText usuario;
    EditText contrasena;
    TextView codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iniciar = findViewById(R.id.bntInicioSesion);
        usuario = findViewById(R.id.tNombre);
        contrasena = findViewById(R.id.editTextTextPassword);

        codigo = findViewById(R.id.tLink);
        codigo.setMovementMethod(LinkMovementMethod.getInstance());
        

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