package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    void save(Blog blog);
    List<Blog> findAll();
    void delete(int id);
    Blog findById(int id);
}
