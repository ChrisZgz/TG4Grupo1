package com.example.tg4grupo1.Bbdd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ModeloHelper extends SQLiteOpenHelper {

    public ModeloHelper(@Nullable Context context) {
        super(context, "steam.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS registros");
        String sql = "CREATE TABLE registros (id TEXT, titulo TEXT, " +
                "descripcion TEXT, desarrollador TEXT, publicador TEXT, " +
                "genero TEXT, tags TEXT, categorias TEXT, comprados TEXT);";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
