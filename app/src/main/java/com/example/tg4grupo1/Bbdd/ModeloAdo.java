package com.example.tg4grupo1.Bbdd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Display;

import com.example.tg4grupo1.Modelo.Modelo;
import com.example.tg4grupo1.Modelo.Steam;
import com.example.tg4grupo1.Utilidades.Metodos;

import java.util.ArrayList;
import java.util.List;

public class ModeloAdo {

    private static final String ID = "id";
    private ModeloHelper helper;
    private static SQLiteDatabase db;

    public ModeloAdo(Context context) {
        helper = new ModeloHelper(context);
        db = helper.getReadableDatabase();
    }

    public void insertarJuegos(ArrayList<Steam> parada) {
        helper.onCreate(db);
        for (int i = 0 ; i< parada.size(); i++) {
            ContentValues valores = new ContentValues();
            valores.put("appid", parada.get(i).getId());
            valores.put("nombre", parada.get(i).getNombre().replace("\"","" ));
            helper.getWritableDatabase().insert("registros", null, valores);
        }
    }

    public void close() throws Exception {
        db.close();
    }
}
