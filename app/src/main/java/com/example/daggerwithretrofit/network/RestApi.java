package com.example.daggerwithretrofit.network;

import com.example.daggerwithretrofit.pojo.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RestApi {
    @GET("/posts")
    Observable<List<Post>> getPosts();
}
