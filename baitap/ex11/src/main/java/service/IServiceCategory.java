package service;

import model.CategoryBlog;

import java.util.List;

public interface IServiceCategory {
    List<CategoryBlog> findAll();

    CategoryBlog findById(Integer id);

    void create(CategoryBlog blog);

    void update(CategoryBlog blog);

    void deleteById(Integer id);
    List<CategoryBlog> findIDCategory(Integer id);
}
