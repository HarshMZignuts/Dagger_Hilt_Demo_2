package com.example.dagger_hilt_demo_2.viewmodel

import android.util.Log
//import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.dagger_hilt_demo_2.model.Post
import com.example.dagger_hilt_demo_2.repo.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class PostViewModel
@Inject
constructor(private val postRepository: PostRepository)
    : ViewModel() {

        val response : LiveData<List<Post>> = postRepository.getPost()
            .catch {
                e->
                Log.d("Main","${e.message}")
            }.asLiveData()

}