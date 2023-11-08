package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.callapi.api.ApiService;
import com.example.callapi.model.Data;
import com.example.callapi.model.TestApi;
import com.example.callapi.model2.Example;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Button btnCallApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCallApi=findViewById(R.id.call_api);

        btnCallApi.setOnClickListener(view -> {
            callApi();
//            callApi1();
        });

    }

    private void callApi1() {
//        ApiService.ApiService1.converter1().enqueue(new Callback<TestApi>() {
//            @Override
//            public void onResponse(Call<TestApi> call, Response<TestApi> response) {
//                TestApi testApi=response.body();
//                if (testApi==null){
//                    Log.e("dfdf", "onResponse: nulll" );
//                }else {
//                    Log.e("dfdf", "onResponse: "+testApi.toGson() );
////                    Log.e("dfdf", "onResponse: Login"+testApi.getLogin() );
////                    Log.e("dfdf", "onResponse: Id"+testApi.getId() );
////                    Log.e("dfdf", "onResponse: AvatarUrl"+testApi.getAvatarUrl() );
////                    Log.e("dfdf", "onResponse: Url"+testApi.getUrl() );
////                    Log.e("dfdf", "onResponse: HtmlUrl"+testApi.getHtmlUrl() );
////                    Log.e("dfdf", "onResponse: GistsUrl"+testApi.getGistsUrl() );
////                    Log.e("dfdf", "onResponse: getName "+testApi.getName());
////                    Log.e("dfdf", "onResponse: getCompany "+testApi.getCompany());
////                    Log.e("dfdf", "onResponse: getBlog "+testApi.getBlog());
////                    Log.e("dfdf", "onResponse: getEmail "+testApi.getEmail());
////                    Log.e("dfdf", "onResponse: getHireable "+testApi.getHireable());
////
////                    Log.e("dfdf", "onResponse: getCreatedAt "+testApi.getCreatedAt());
////                    Log.e("dfdf", "onResponse: getUpdatedAt "+testApi.getUpdatedAt());
//
//
//
//
//                }
//            }

//            @Override
//            public void onFailure(Call<TestApi> call, Throwable t) {
//                Log.e("dfdf", "onFailure: " );
//            }
//        });
    }

    private void callApi() {
//        ApiService.apiService.converter("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2OTkzMjU1MjEsImRhdGEiOnsidXNlcl9pZCI6MCwiZGV2aWNlX2lkIjoxLCJ0eXBlIjoxLCJuYW1lIjoidGVzdCIsImNsaWVudF9pZCI6InRlc3QifSwiZXhwIjoxNjk5NDExOTIxfQ.IrzOs1b2-feKnCDdNA-Cm07H-fyn5POw7mKpxXsssZA")
//                .enqueue(new Callback<Data>() {
//            @Override
//            public void onResponse(Call<Data> call, Response<Data> response) {
//                Data data=response.body();
//                if (data==null){
//                    Log.e("dfdf", "onResponse: null " );
//                }else {
//                    Log.e("dfdf", "onResponse: "+data.toJson() );
//                }
//
//
//            }
//
//            @Override
//            public void onFailure(Call<Data> call, Throwable t) {
//                Log.e("dfdf", "onFailure: " );
//            }
//        });
        ApiService.apiService.converter1("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2OTkzMjU1MjEsImRhdGEiOnsidXNlcl9pZCI6MCwiZGV2aWNlX2lkIjoxLCJ0eXBlIjoxLCJuYW1lIjoidGVzdCIsImNsaWVudF9pZCI6InRlc3QifSwiZXhwIjoxNjk5NDExOTIxfQ.IrzOs1b2-feKnCDdNA-Cm07H-fyn5POw7mKpxXsssZA")
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        Log.e("ddd", "onResponse: "+ new Gson().toJson(response.body()));
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Log.e("ddd", "onFailure: ",t);
                    }
                });
    }


}