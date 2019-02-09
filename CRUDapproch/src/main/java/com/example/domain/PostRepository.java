package com.example.domain;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
