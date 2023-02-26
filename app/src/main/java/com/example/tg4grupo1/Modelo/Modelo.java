package com.example.tg4grupo1.Modelo;

import java.io.Serializable;

public class Modelo implements Serializable {
    //esto esta en fase de prueba darme mas tiempo XD
    private String appid;
    private String name;
    private String short_description;
    private String developer;
    private String publisher;
    private String genre;
    private String tags;
    private String type;
    private String category;
    private String owners;
    private String positive;
    private String negative;
    private String price;
    private String initialprice;
    private String discount;
    private String ccu;
    private String languagues;
    private String platforms;
    private String release_date;
    private String requiered_age;
    private String website;
    private String header_image;

    public Modelo(String appid, String name, String short_description, String developer,
                  String publisher, String genre, String tags, String type, String category,
                  String owners, String positive, String negative, String price, String initialprice,
                  String discount, String ccu, String languagues, String platforms,
                  String release_date, String requiered_age, String website, String header_image) {
        this.appid = appid;
        this.name = name;
        this.short_description = short_description;
        this.developer = developer;
        this.publisher = publisher;
        this.genre = genre;
        this.tags = tags;
        this.type = type;
        this.category = category;
        this.owners = owners;
        this.positive = positive;
        this.negative = negative;
        this.price = price;
        this.initialprice = initialprice;
        this.discount = discount;
        this.ccu = ccu;
        this.languagues = languagues;
        this.platforms = platforms;
        this.release_date = release_date;
        this.requiered_age = requiered_age;
        this.website = website;
        this.header_image = header_image;
    }

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

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public String getNegative() {
        return negative;
    }

    public void setNegative(String negative) {
        this.negative = negative;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInitialprice() {
        return initialprice;
    }

    public void setInitialprice(String initialprice) {
        this.initialprice = initialprice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getCcu() {
        return ccu;
    }

    public void setCcu(String ccu) {
        this.ccu = ccu;
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
