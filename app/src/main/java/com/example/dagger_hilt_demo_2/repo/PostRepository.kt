package com.example.dagger_hilt_demo_2.repo

import com.example.dagger_hilt_demo_2.model.Post
import com.example.dagger_hilt_demo_2.network.PostServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject



class PostRepository
@Inject
constructor(private val postApiService : PostServiceImp) {
    fun getPost() : Flow<List<Post>> = flow {
        val response = postApiService.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)
}