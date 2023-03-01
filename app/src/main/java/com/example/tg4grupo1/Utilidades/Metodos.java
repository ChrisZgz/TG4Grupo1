package com.example.tg4grupo1.Utilidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;

import com.example.tg4grupo1.Bbdd.DownloadJson;
import com.example.tg4grupo1.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

public class Metodos {

    public static final String DBNAME = "steam.db";
    private static AlertDialog dialogProgress;

    public static void descargarJson(Context contexto) {
        DownloadJson.insertarDatos(contexto);
        DownloadJson json = new DownloadJson();

        try {
            json.execute("https://api.steampowered.com/ISteamApps/GetAppList/v2/?format=json").get();
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

    public static void AlertProgressCerrar() {
        dialogProgress.dismiss();
    }

    public static void AlertError(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.alert_error, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public static void AlertProgres(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.alert_cargando, null);
        builder.setView(view);
        dialogProgress = builder.create();
        dialogProgress.setCanceledOnTouchOutside(false);
        dialogProgress.show();
    }

    public static void AlertCreditos(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.alert_creditos, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
