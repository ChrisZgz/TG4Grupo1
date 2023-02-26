package com.example.tg4grupo1.Bbdd;

import android.content.Context;
import android.os.AsyncTask;

import com.example.tg4grupo1.Modelo.Modelo;
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
    public static ArrayList<Modelo> modelos = new ArrayList<>();

    public static void insertarDatos(Context context) {
        CONTEXT = context;
    }

    @Override
    protected void onPreExecute(){
      /*  if (modelos.size() != 0){
            AlertDialogs.AlertProgres(CONTEXT);
        }*/
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

        for (int i = 0; i < objeto.size(); i++) {
            modelos.add(new Modelo(objeto.get(i).get("name").toString(),
                    objeto.get(i).get("short_description").toString(),
                    objeto.get(i).get("developer").toString(),
                    objeto.get(i).get("publisher").toString(),
                    objeto.get(i).get("genre").toString(),
                    objeto.get(i).get("type").toString(),
                    objeto.get(i).get("category").toString(),
                    objeto.get(i).get("price").toString(),
                    objeto.get(i).get("languagues").toString(),
                    objeto.get(i).get("platforms").toString(),
                    objeto.get(i).get("release_date").toString(),
                    objeto.get(i).get("required_age").toString(),
                    objeto.get(i).get("website").toString(),
                    objeto.get(i).get("header_image").toString()

            ));
        }

        ModeloAdo modeloAdo = new ModeloAdo(CONTEXT);
        modeloAdo.insertarJuegos(modelos);
    }

    private static Boolean bb = false;
    @Override
    protected void onPostExecute(String bitmap) { /*
        if (bb){
            Handler handler = new Handler(Looper.myLooper());
            handler.postDelayed(()->{
                AlertDialogs.AlertProgressCerrar();
            },2000);
        }
        bb = true;
        */
    }
}
