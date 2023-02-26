package com.example.tg4grupo1.Utilidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tg4grupo1.Bbdd.DownloadJson;
import com.example.tg4grupo1.Vistas.ListaSteam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public class Metodos {

    public static final String DBNAME = "steam.db";

    public static void descargarJson(Context contexto) {
        DownloadJson.insertarDatos(contexto);
        DownloadJson json = new DownloadJson();

        try {
            json.execute("https://drive.google.com/u/0/uc?id=1UUC9MmnN9aUf6_wLcxcPmSXSjbyglpbx&export=download").get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

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
