package com.codeup.springblock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsController {
    @GetMapping("/posts")
    @ResponseBody
        public String post(){
            return "posts index page";
        }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(){
            return "view an individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }

}
