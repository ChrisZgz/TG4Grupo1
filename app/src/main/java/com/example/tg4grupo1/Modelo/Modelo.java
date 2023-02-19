package com.example.tg4grupo1.Modelo;

public class Modelo {
    private String id;
    private String titulo;
    private String descripcion;
    private String desarrollador;
    private String publicador;
    private String genero;
    private String tags;
    private String categorias;
    private String comprados;

    public Modelo(String id, String titulo, String descripcion, String desarrollador,
                  String publicador, String genero, String tags, String categorias, String comprados) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.desarrollador = desarrollador;
        this.publicador = publicador;
        this.genero = genero;
        this.tags = tags;
        this.categorias = categorias;
        this.comprados = comprados;
    }

    public Modelo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPublicador() {
        return publicador;
    }

    public void setPublicador(String publicador) {
        this.publicador = publicador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getComprados() {
        return comprados;
    }

    public void setComprados(String comprados) {
        this.comprados = comprados;
    }
}
