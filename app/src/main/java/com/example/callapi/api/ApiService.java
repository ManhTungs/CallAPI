package com.example.callapi.api;

import com.example.callapi.model.Data;
import com.example.callapi.model.TestApi;
import com.example.callapi.model2.Example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;


public interface ApiService {

    //https://converter.eztechglobal.com/api/v1/queues-convert/8780
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    ApiService apiService = new Retrofit.Builder()
                    //https://converter.eztechglobal.com
            .baseUrl("https://converter.eztechglobal.com")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    @GET("/api/v1/queues-convert/8780")
    Call<Data> converter(@Header("AuthorizationApi") String header);

    @GET("/api/v1/queues-convert/8780")
    Call<Example> converter1(@Header("AuthorizationApi") String header);





    //https://api.github.com/users/3
//    ApiService ApiService1=new Retrofit.Builder()
//            .baseUrl("https://api.github.com/")
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .build()
//            .create(ApiService.class);
//
//    @GET("users/3")
//    Call<TestApi> converter1();

}
