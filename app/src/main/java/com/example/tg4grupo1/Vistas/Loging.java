package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tg4grupo1.R;

public class Loging extends AppCompatActivity {
    Button iniciar;
    EditText usuario;
    EditText contrasena;
    TextView codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
        if (usuario.getText().toString().isEmpty()) {
            Toast.makeText(null, "El campo usuario no puede quedar vacio", Toast.LENGTH_SHORT).show();
        } else if (contrasena.getText().toString().isEmpty()) {
            Toast.makeText(null, "El campo contraseña no puede quedar vacio", Toast.LENGTH_SHORT).show();
        }

        if (usuario.getText().toString().equals("admin") && contrasena.getText().toString().equals("admin")) {
            Intent intent = new Intent(getApplicationContext(), ListaSteam.class);
            startActivity(intent);
        }
    }
}