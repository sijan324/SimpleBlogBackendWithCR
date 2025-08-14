package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
//constructor injection
   public PostService(PostRepository postRepository){
       this.postRepository=postRepository;
   }
   //create a post
    public Post createPost(Post post){
        if (post.getTitle() == null || post.getTitle().isEmpty()) {

            throw new RuntimeException("Title cannnot be empty ");
        }
        return postRepository.save(post);
    }
    public List<Post> getAllPosts(){
       return  postRepository.findAll();
    }
}
