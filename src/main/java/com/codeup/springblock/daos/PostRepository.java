package com.codeup.springblock.daos;

import com.codeup.springblock.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
