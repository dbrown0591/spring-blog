package com.codeup.springblock;

import com.codeup.springblock.daos.PostRepository;
import com.codeup.springblock.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {

        this.postRepository = postRepository;

    }

    public void save(Post post) {
        postRepository.save(post);
    }

    public Iterable<Post> findAll() {

       return postRepository.findAll();
    }

    public Post findOne(long id) {

        return postRepository.findOne(id);
    }

    public void update(Post post) {
     postRepository.save(post);
    }

}
