package com.codeup.springblock;

import com.codeup.springblock.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class PostsController {
    // Auto-wiring
    // For dependency injection
    // 1. Create an instance variable with your dependency
    // 2. Inject the dependency through the constructor and assign it to your instance variable
    private PostService postService;

    public PostsController(PostService service) {
        this.postService = service;
    }
    @GetMapping("/posts")
    public String index(Model viewModel) {
        Iterable<Post> posts = postService.findAll();


        viewModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @RequestMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel) {
        Post post = new Post("Test post", "Test body");

        viewModel.addAttribute("post", post);

        return "posts/show";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable long id, Model viewModel) {
            //Post post = new Post("Test post", "Test body");
        Post post = postService.findOne(id);
        viewModel.addAttribute("post", post);
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model viewModel){
        viewModel.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(@ModelAttribute  Post post){

      postService.save(post);
        return "create a new post";
    }

    @GetMapping("/post/{id}/edit")
    public String showEditForm(@PathVariable long id, Model viewModel){
        Post post = postService.findOne(id);
        viewModel.addAttribute("post", post);
        return "post/edit";
    }

    @PostMapping("posts/edit")
    public String updatePost(@ModelAttribute Post post){
        postService.update(post);
        return "redirect:/post";
    }

}
