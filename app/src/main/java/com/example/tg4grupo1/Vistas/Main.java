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
import android.widget.Toast;

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
            logar();
        });
    }

    private void logar(){
        if (usuario.getText().equals("")) {
            Toast.makeText(null, "El campo usuario no puede quedar vacio", Toast.LENGTH_SHORT).show();
        } else if (contrasena.getText().equals("")) {
            Toast.makeText(null, "El campo contraseña no puede quedar vacio", Toast.LENGTH_SHORT).show();
        }

        if (usuario.getText().equals("admin") && contrasena.getText().equals("admin")) {
            Toast.makeText(null, "Correcto!", Toast.LENGTH_SHORT).show();
        }
    }
}