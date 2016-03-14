package com.smallwei.retrofitdemo;

import java.util.List;
import java.util.Map;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.QueryMap;


/**
 * Created by smallwei on 2016/3/13.
 */
public class HttpUtils {
    public  interface getConnect{

// http://mobile.ximalaya.com/v1/track/baseInfo?device=android&trackId=11418829

        @GET("/v1/track/baseInfo")
        Call<JavaBena> getBean(@Query("device") String device,@Query("trackId") int id);

        //http://106.187.92.60/android_api/login.php?username=jyh&password=jyh
        @GET("/android_api/login.php")
        Call<UserInfo> getUserInfo(@Query("username") String name,@Query("password") int password);

        @GET("/android_api/login.php")
        Call<UserInfo> getUserInfo2(@Query("keychain") String key);

        @GET("/android_api/login.php")
        UserInfo getUserInfo4(@Query("keychain") String key);

//        http://106.187.92.60/android_api/login.php?username=casper&password=casper&keychain=123123123

        @GET("/android_api/login.php")
        Call<UserInfo> getUserInfo3(@QueryMap Map<String,Object> options);


    }
    public static getConnect sConnect;
/*    categoryInfoRecommendService = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://mobile.ximalaya.com").build().create(CategoryInfoRecommendService.class);*/

    static {
        sConnect= new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("http://106.187.92.60")
                .build().create(getConnect.class);
    }
    public static getConnect gConnect(){
        return sConnect;
    }
}
