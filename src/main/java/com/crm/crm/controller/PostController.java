package com.crm.crm.controller;
import com.crm.crm.entity.Post;
import com.crm.crm.respository.CommentRepository;
import com.crm.crm.respository.PostRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostRepository postRepository;
    private CommentRepository commentRep;

    public PostController(PostRepository postRepository, CommentRepository commentRep){
        this.postRepository=postRepository;
        this.commentRep=commentRep;
    }

    @RequestMapping
    public String createPost(@RequestBody Post post){
        postRepository.save(post);
        return "saved";
    }

    @DeleteMapping
    public void deletePost(){
        postRepository.deleteById(1L);
    }

}
