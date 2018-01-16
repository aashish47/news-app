package com.example.hp.techie.apis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hp on 10/8/2017.
 */

public class ApiService {
    static Api api = null;

    private ApiService(){}

    public static Api getApi(){
        if(api == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://newsapi.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            api = retrofit.create(Api.class);
        }
        return api;
    }
}
