package com.codeup.springblock.daos;

import com.codeup.springblock.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post, Long> {
}
