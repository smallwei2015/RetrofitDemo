package com.smallwei.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<JavaBena> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //HttpUtils.gConnect().getBean("android", 11418829).enqueue(this);

        /*HttpUtils.gConnect().getUserInfo2("123123123123").enqueue(new Callback<UserInfo>() {
            @Override
            public void onResponse(Response<UserInfo> response, Retrofit retrofit) {
                Toast.makeText(MainActivity.this, response.body().getMsg(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });*/

        /*Map<String,Object> options=new HashMap<>();
//        username=casper&password=casper&keychain=123123123
        options.put("username","casper");
        options.put("password","casper");
        options.put("keychain", "123123123");
        HttpUtils.gConnect().getUserInfo3(options).enqueue(new Callback<UserInfo>() {
            @Override
            public void onResponse(Response<UserInfo> response, Retrofit retrofit) {
                Toast.makeText(MainActivity.this, response.body().getMsg(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });*/

        UserInfo userInfo = HttpUtils.sConnect.getUserInfo4("123123123");

        Toast.makeText(this, userInfo.getMsg(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResponse(Response<JavaBena> response, Retrofit retrofit) {
        Log.d("111111", response.body().getAlbumImage());

        Toast.makeText(this, "response.body().getAlbumId():" + response.body().getAlbumId(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Throwable t) {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        Log.d("22222", t.getMessage());
    }
}
