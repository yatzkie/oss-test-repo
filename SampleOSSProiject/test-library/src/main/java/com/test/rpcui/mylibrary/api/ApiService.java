package com.test.rpcui.mylibrary.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by phillipcui on 5/29/17.
 */

public interface ApiService {

    @GET("/scan/identifications")
    Call<List<String>> identify(@Query("filter") String filter);

    @POST("/auth/evrythng/users?anonymous=true")
    Call<String> createAnonymousUser(@Body String anonymous);

    @POST("/auth/evrythng")
    Call<String> loginUser(@Body String credentials);
}
