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
            valores.put("titulo", parada.get(i).getName().replace("\"","" ));
            valores.put("descripcion", parada.get(i).getShort_description().replace("\"", "" ));
            valores.put("desarrollador", parada.get(i).getDeveloper().replace("\"", "" ));
            valores.put("publicador", parada.get(i).getPublisher().replace("\"","" ));
            valores.put("genero", parada.get(i).getGenre().replace("\"","" ));
            valores.put("categorias", parada.get(i).getCategory().replace("\"","" ));
            valores.put("precio", parada.get(i).getPrice().replace("\"","" ));
            valores.put("lenguajes", parada.get(i).getLanguagues().replace("\"","" ));
            valores.put("plataformas", parada.get(i).getPlatforms().replace("\"","" ));
            valores.put("fechaDeSalida", parada.get(i).getRelease_date().replace("\"","" ));
            valores.put("edadRequerida", parada.get(i).getRequiered_age().replace("\"","" ));
            valores.put("web", parada.get(i).getWebsite().replace("\"","" ));
            valores.put("cabecera", parada.get(i).getHeader_image().replace("\"","" ));
            helper.getWritableDatabase().insert("registros", null, valores);
        }
    }
}
