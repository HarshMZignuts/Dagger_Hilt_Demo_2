package com.example.dagger_hilt_demo_2.network

import com.example.dagger_hilt_demo_2.model.Post
import javax.inject.Inject

class PostServiceImp @Inject constructor(private val postApiService: PostApiService) {

    suspend fun getPost():List<Post> = postApiService.getPost()
}