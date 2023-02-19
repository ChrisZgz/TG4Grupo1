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

    private Context context;
    private static final String ID = "id";

    public ModeloAdo(Context context){
        this.context = context;
    }

    public List<Modelo> getAll(){
        List<Modelo> juegos = new ArrayList<>();
        String sql = "SELECT * FROM juegos";

        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            Cursor cursor = db.rawQuery(sql, null);

            rellenarAlumnos(cursor, juegos);
        }

        return juegos;
    }

    private void rellenarAlumnos(Cursor cursor, List<Modelo> juegos) {
        while (cursor.moveToNext()){
            Modelo juego = new Modelo();
            juego.setId(cursor.getString(0));
            juego.setTitulo(cursor.getString(1));
            juego.setDescripcion(cursor.getString(2));
            juego.setDesarrollador(cursor.getString(3));
            juego.setPublicador(cursor.getString(4));
            juego.setGenero(cursor.getString(5));
            juego.setTags(cursor.getString(6));
            juego.setCategorias(cursor.getString(7));
            juego.setComprados(cursor.getString(8));
            juego.add(juego);

        }
    }

    public Modelo getById(String id){
        String sql = "SELECT * FROM alumnos WHERE id = ?";

        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            Cursor cursor = db.rawQuery(sql, new String[]{String.valueOf(id)});

            if (cursor.moveToNext()){
                Modelo juegos = new Modelo();
                juegos.setId(id);
                juegos.setTitulo(cursor.getString(1));
                juegos.setDescripcion(cursor.getString(2));
                juegos.setDesarrollador(cursor.getString(3));
                juegos.setPublicador(cursor.getString(4));
                juegos.setGenero(cursor.getString(5));
                juegos.setTags(cursor.getString(6));
                juegos.setCategorias(cursor.getString(7));
                juegos.setComprados(cursor.getString(8));
                return juegos;
            }
            else
                return null;
        }
    }

    public Modelo insertarJuegos(String id, String titulo, String descripcion, String desarrollador,
                                 String publicador, String genero, String tags, String categorias,
                                 String comprados){
        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)) {
            ContentValues cv = new ContentValues();
            cv.put(ID, id);
            cv.put("titulo", titulo);
            cv.put("descripcion", descripcion);
            cv.put("desarrollador", desarrollador);
            cv.put("publicador", publicador);
            cv.put("genero", genero);
            cv.put("tags", tags);
            cv.put("categorias", categorias);
            cv.put("comprados", comprados);

            Modelo biblioteca = new Modelo();
            biblioteca.setId(id);
            biblioteca.setTitulo(titulo);
            biblioteca.setDescripcion(descripcion);
            biblioteca.setDesarrollador(desarrollador);
            biblioteca.setPublicador(publicador);
            biblioteca.setGenero(genero);
            biblioteca.setTags(tags);
            biblioteca.setCategorias(categorias);
            biblioteca.setComprados(comprados);

            return biblioteca;
        }
    }

    public void actualizarBiblioteca(Modelo biblioteca){
        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            ContentValues cv = new ContentValues();
            cv.put(ID, biblioteca.getId());
            cv.put("titulo", biblioteca.getTitulo());
            cv.put("descripcion", biblioteca.getDescripcion());
            cv.put("desarrollador", biblioteca.getDesarrollador());
            cv.put("publicador", biblioteca.getPublicador());
            cv.put("genero", biblioteca.getGenero());
            cv.put("tags", biblioteca.getTags());
            cv.put("categorias", biblioteca.getCategorias());
            cv.put("comprados", biblioteca.getComprados());
            //hay que poner el nombre de la tabla aun
            db.update("", cv, "id = ?", new String[]{String.valueOf(biblioteca.getId())});
        }
    }

    public void borrarAlumno(Modelo biblioteca){
        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            //hay que poner el nombre de la tabla aun
            db.delete("", "id = ?", new String[] {String.valueOf(biblioteca.getId())});
        }
    }

    public List<Modelo> update(){
        List<Modelo> parada = new ArrayList<>();
        String sql = "UPDATE alumnos SET alumnos = ?";

        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            Cursor cursor = db.rawQuery(sql, null);

            rellenarAlumnos(cursor, parada);
        }

        return parada;
    }

    public List<Modelo> createTable(){
        List<Modelo> alumnos = new ArrayList<>();
        String sql = "CREATE TABLE databasename(String parada)";

        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            Cursor cursor = db.rawQuery(sql, null);

            rellenarAlumnos(cursor, alumnos);
        }

        return alumnos;
    }

    public List<Modelo> busccar(){
        List<Modelo> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM nombre_tabla WHERE id LIKE '%CAMPO_BUSCAR%' OR titulo LIKE '%CAMPO_BUSCAR%'" +
                "OR ultimaactualizacion LIKE '%CAMPO_BUSCAR%' OR coordenadas LIKE '%CAMPO_BUSCAR%' OR " +
                "icono LIKE '%CAMPO_BUSCAR%'";

        try (SQLiteDatabase db = Metodos.abrirBD(context, Metodos.DBNAME)){
            Cursor cursor = db.rawQuery(sql, null);

            rellenarAlumnos(cursor, alumnos);
        }

        return alumnos;
    }
}
