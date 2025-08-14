package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService;

    //constructor injection
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Get All posts
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    @PostMapping("/posts")
// create a new post
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }
}
