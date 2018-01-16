package com.example.hp.techie.models;

/**
 * Created by Hp on 10/8/2017.
 */

public class Article {



    String author;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    String title;
    String description;
    String url;

    public Article(String author, String title, String description, String url, String urlToImage) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
    }

    String urlToImage;
}
