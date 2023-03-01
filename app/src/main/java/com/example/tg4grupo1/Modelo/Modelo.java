package com.example.tg4grupo1.Modelo;

import java.io.Serializable;

public class Modelo implements Serializable {
    //esto esta en fase de prueba darme mas tiempo XD
    private String name;
    private String short_description;
    private String developer;
    private String publisher;
    private String genre;
    private String type;
    private String category;
    private String price;
    private String languagues;
    private String platforms;
    private String release_date;
    private String requiered_age;
    private String website;
    private String header_image;

    public Modelo(String name, String short_description, String developer, String publisher,
                  String genre, String type, String category, String price, String languagues,
                  String platforms, String release_date, String requiered_age, String website,
                  String header_image) {
        this.name = name;
        this.short_description = short_description;
        this.developer = developer;
        this.publisher = publisher;
        this.genre = genre;
        this.type = type;
        this.category = category;
        this.price = price;
        this.languagues = languagues;
        this.platforms = platforms;
        this.release_date = release_date;
        this.requiered_age = requiered_age;
        this.website = website;
        this.header_image = header_image;
    }

    public Modelo() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLanguagues() {
        return languagues;
    }

    public void setLanguagues(String languagues) {
        this.languagues = languagues;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRequiered_age() {
        return requiered_age;
    }

    public void setRequiered_age(String requiered_age) {
        this.requiered_age = requiered_age;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getHeader_image() {
        return header_image;
    }

    public void setHeader_image(String header_image) {
        this.header_image = header_image;
    }
}
