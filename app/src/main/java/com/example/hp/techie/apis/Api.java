package com.example.hp.techie.apis;

import com.example.hp.techie.models.Article;
import com.example.hp.techie.models.NewsObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Hp on 10/8/2017.
 */

public interface Api {
    @GET("/v1/articles")
    Call<NewsObject> getArticle(@Query("source") String source, @Query("apiKey") String apikey);
}
