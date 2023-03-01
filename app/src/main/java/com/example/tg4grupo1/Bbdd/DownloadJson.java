package com.example.tg4grupo1.Bbdd;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

import com.example.tg4grupo1.Modelo.Steam;
import com.example.tg4grupo1.Utilidades.Metodos;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DownloadJson extends AsyncTask<String, Void, String> {

    private static Context CONTEXT;
    private static String result = "";
    public static ArrayList<Steam> modelos = new ArrayList<Steam>();

    public static void insertarDatos(Context context) {
        CONTEXT = context;
    }

    @Override
    protected void onPreExecute(){
        if (modelos.size() != 0){
            Metodos.AlertProgres(CONTEXT);
        }
    }

    @Override
    protected String doInBackground(String... urls) {
        result = "";
        URL url;
        HttpURLConnection urlConnection = null;
        try {
            url = new URL(urls[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            int data = reader.read();
            while (data != -1) {
                char current = (char) data;
                result += current;
                data = reader.read();
            }
            cargarModelo();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
    }

    public void cargarModelo() {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
        JsonElement idElement = jsonObject.get("result");
        JsonArray lista = idElement.getAsJsonArray();
        List<JsonObject> objeto = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            objeto.add((JsonObject) lista.get(i));
        }
        List<JsonObject> geome = new ArrayList<>();
        for (int i = 0; i < objeto.size(); i++) {
            geome.add((JsonObject) objeto.get(i).get("geometry"));

            modelos.add(new Steam(objeto.get(i).get("id").toString(),
                    objeto.get(i).get("name").toString()
            ));
        }
    }

    private static Boolean bb = false;
        @Override
        protected void onPostExecute(String bitmap) {
            if (bb){
                Handler handler = new Handler(Looper.myLooper());
                handler.postDelayed(()->{
                    Metodos.AlertProgressCerrar();
                },2000);
            }
            bb = true;
        }
}
