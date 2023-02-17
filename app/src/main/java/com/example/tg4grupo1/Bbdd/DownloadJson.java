package com.example.tg4grupo1.Bbdd;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DownloadJson /*extends AsyncTask<String, Void, String>*/ {

    /*

    private static Context CONTEXT;
    private static String result = "";
    public static File iconoImagen;
    public static ArrayList<Modelo> modelos = new ArrayList<>();

    public static void metercosas(Context context) {
        CONTEXT = context;
    }

    @Override
    protected void onPreExecute(){
        if (modelos.size() != 0){
            AlertDialogs.AlertProgres(CONTEXT);
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
            //geome.get(i).get("coordinates");

            modelos.add(new Modelo(objeto.get(i).get("id").toString(),
                    objeto.get(i).get("title").toString(),
                    objeto.get(i).get("lastUpdated").toString(),
                    geome.get(i).get("coordinates").toString(),
                    objeto.get(i).get("icon").toString()
            ));
        }
        //aqui lo que hacemos es llamar el metodo para meter dentro de iconoImagen el
        //bitmap para utilizarlo luego en la inserción de datos

        //downloadImage(modelos.get(0).getIcono().replace("\"", ""));

        //aqui lo que hacemos es meter los datos dentro de la base de datos, para luego hacer
        //las consultas correspondiente a esta

//        ModeloHelper modeloHelper = new ModeloHelper(CONTEXT);
//        modeloHelper.getWritableDatabase();

        ModeloAdo modeloAdo = new ModeloAdo(CONTEXT);
        modeloAdo.insertar(modelos);
    }


    public void downloadImage(String imageUrl) {
    }
    private static Boolean bb = false;
    @Override
    protected void onPostExecute(String bitmap) {
        if (bb){
            Handler handler = new Handler(Looper.myLooper());
            handler.postDelayed(()->{
                AlertDialogs.AlertProgressCerrar();
            },2000);
        }
        bb = true;
    }*/
}
