package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository repository;
    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(int id) {
repository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
        String stringId = "MX-011";
        return repository.findById(Integer.valueOf(stringId.substring(3))).orElse(null);
    }
}
