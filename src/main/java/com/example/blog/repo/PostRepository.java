package com.example.blog.repo;

import com.example.blog.modeles.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
