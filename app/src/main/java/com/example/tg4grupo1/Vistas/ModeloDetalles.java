package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.tg4grupo1.Modelo.Modelo;
import com.example.tg4grupo1.R;

import java.util.ArrayList;

public class ModeloDetalles extends AppCompatActivity {
    private LinearLayout line;
    private ArrayList<Modelo> modelo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelo_detalles);

        line = findViewById(R.id.linearContenedor);

        for(int i = 0; i < modelo.size(); i++){
            LayoutInflater inflate = LayoutInflater.from(this);
            View view = inflate.inflate(R.layout.scrol_modelo, line, false);
            EditText titulo = view.findViewById(R.id.tTitulo);
            EditText precio = view.findViewById(R.id.tPrecio);
            EditText categoria = view.findViewById(R.id.tCategoria);
            EditText plataforma = view.findViewById(R.id.tPlataforma);
            titulo.append(modelo.get(i).getName());
            precio.append(modelo.get(i).getPrice());
            categoria.append(modelo.get(i).getCategory());
            plataforma.append(modelo.get(i).getPlatforms());
            line.addView(view);
        }


    }
}