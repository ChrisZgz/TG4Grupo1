package com.example.tg4grupo1.Modelo;

public class Steam {

    private String id;
    private String nombre;

    public Steam(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Steam() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
