package com.example.tg4grupo1.Utilidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.tg4grupo1.Bbdd.DownloadJson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public class Metodos {

  /*  public static void descargarJson(Context context) {

        DownloadJson json = new DownloadJson();
        try {
            json.execute("https://www.zaragoza.es/sede/servicio/urbanismo-infraestructuras/equipamiento/parada-taxi.json?rf=html&srsname=wgs84&start=0&rows=1000&distance=500").get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    public static final String DBNAME = "test.db";

    public static void inicializarSqlite(Context context, String name, int idRes){
        File dbFile = context.getDatabasePath(name);

        if (!dbFile.exists()){
            try (InputStream is = context.getResources().openRawResource(idRes);
                 FileOutputStream fos = new FileOutputStream(dbFile)) {
                byte[] buffer = new byte[1024];
                int c = 0;

                while ((c = is.read(buffer)) > 0){
                    fos.write(buffer, 0, c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static SQLiteDatabase abrirBD(Context context, String name){
        SQLiteDatabase db = SQLiteDatabase.openDatabase(
                context.getDatabasePath(name).getAbsolutePath(),
                null,
                SQLiteDatabase.OPEN_READWRITE);
        return db;
    }
}
