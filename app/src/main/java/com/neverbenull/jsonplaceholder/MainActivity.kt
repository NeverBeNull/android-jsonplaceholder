package com.neverbenull.jsonplaceholder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.neverbenull.jsonplaceholder.data.remote.album.AlbumService
import com.neverbenull.jsonplaceholder.data.remote.comment.CommentService
import com.neverbenull.jsonplaceholder.data.remote.photo.PhotoService
import com.neverbenull.jsonplaceholder.data.remote.post.PostService
import com.neverbenull.jsonplaceholder.data.remote.todo.TodoService
import com.neverbenull.jsonplaceholder.data.remote.user.UserService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var testAlbumService : AlbumService
    @Inject lateinit var testCommentService : CommentService
    @Inject lateinit var testPhotoService : PhotoService
    @Inject lateinit var testPostService : PostService
    @Inject lateinit var testTodoService : TodoService
    @Inject lateinit var testUserService : UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(Dispatchers.IO) {
            Timber.d(testAlbumService.getAlbums().toString())
            Timber.d(testCommentService.getComments().toString())
            Timber.d(testPhotoService.getPhotos().toString())
            Timber.d(testPostService.getPosts().toString())
            Timber.d(testTodoService.getTodos().toString())
            Timber.d(testUserService.getUsers().toString())
        }
    }
}