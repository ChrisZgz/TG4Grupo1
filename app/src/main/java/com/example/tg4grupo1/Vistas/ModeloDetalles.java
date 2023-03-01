package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tg4grupo1.Modelo.Modelo;
import com.example.tg4grupo1.Modelo.Steam;
import com.example.tg4grupo1.R;

import java.util.ArrayList;

public class ModeloDetalles extends AppCompatActivity {
    private RecyclerView recy;
    private ArrayList<Steam> modelo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelo_detalles);

        recy = findViewById(R.id.recyclerSteam);

        for(int i = 0; i < modelo.size(); i++){
            LayoutInflater inflate = LayoutInflater.from(this);
            View view = inflate.inflate(R.layout.scrol_modelo, recy, false);
            TextView id = view.findViewById(R.id.tIdSteam);
            TextView nombre = view.findViewById(R.id.tNombreSteam);
            id.append(modelo.get(i).getId());
            nombre.append(modelo.get(i).getNombre());
            recy.addView(view);
        }


    }
}