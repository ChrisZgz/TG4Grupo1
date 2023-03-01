package com.example.tg4grupo1.Vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.tg4grupo1.Adapter.SteamAdapter;
import com.example.tg4grupo1.Bbdd.DownloadJson;
import com.example.tg4grupo1.Modelo.Steam;
import com.example.tg4grupo1.R;

import java.util.ArrayList;

public class ListaSteam extends AppCompatActivity implements SteamAdapter.OnNoteListener {

    View view;
    Context context;
    RecyclerView recycler;
    ArrayList<Steam> contenidRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasteam);

        recycler = view.findViewById(R.id.recyclerSteam);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recycler.setLayoutManager(layoutManager);

        if (contenidRecycler.size() == 0) {
            contenidRecycler = DownloadJson.modelos;
        }

        recycler.setAdapter(new SteamAdapter(DownloadJson.modelos, this));


    }

    @Override
    public void onNoteClic(int posicion) {

    }

    public void onStop() {
        super.onStop();
    }
}