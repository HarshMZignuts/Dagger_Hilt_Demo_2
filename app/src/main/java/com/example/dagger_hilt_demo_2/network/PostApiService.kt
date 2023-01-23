package com.example.dagger_hilt_demo_2.network

import com.example.dagger_hilt_demo_2.model.Post
import retrofit2.http.GET

interface PostApiService {

    @GET("posts")
    suspend fun getPost() : List<Post>
}