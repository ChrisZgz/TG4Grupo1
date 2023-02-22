package com.example.tg4grupo1.Bbdd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.tg4grupo1.Modelo.Modelo;
import com.example.tg4grupo1.Utilidades.Metodos;

import java.util.ArrayList;
import java.util.List;

public class ModeloAdo {

    private static final String ID = "id";
    private ModeloHelper helper;
    private SQLiteDatabase db;

    public ModeloAdo(Context context) {
        helper = new ModeloHelper(context);
        db = helper.getReadableDatabase();
    }

    public void insertarJuegos(ArrayList<Modelo> parada) {
        helper.onCreate(db);
        for (int i = 0 ; i< parada.size(); i++) {
            ContentValues valores = new ContentValues();
            valores.put("id", parada.get(i).getId().replace("\"","" ));
            valores.put("titulo", parada.get(i).getTitulo().replace("\"","" ));
            valores.put("descripcion", parada.get(i).getDescripcion().replace("\"", "" ));
            valores.put("desarrollador", parada.get(i).getDesarrollador().replace("\"", "" ));
            valores.put("publicador", parada.get(i).getPublicador().replace("\"","" ));
            valores.put("genero", parada.get(i).getGenero().replace("\"","" ));
            valores.put("tags", parada.get(i).getTags().replace("\"","" ));
            valores.put("categorias", parada.get(i).getCategorias().replace("\"","" ));
            valores.put("comprados", parada.get(i).getComprados().replace("\"","" ));
            helper.getWritableDatabase().insert("registros", null, valores);
        }
    }
}
