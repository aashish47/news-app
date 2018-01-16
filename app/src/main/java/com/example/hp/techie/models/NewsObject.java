package com.example.hp.techie.models;

import java.util.ArrayList;

/**
 * Created by Hp on 10/8/2017.
 */

public class NewsObject {
    public ArrayList<Article> getArticles() {
        return articles;
    }

    ArrayList<Article> articles;

    public NewsObject(ArrayList<Article> articles) {
        this.articles = articles;
    }
}
