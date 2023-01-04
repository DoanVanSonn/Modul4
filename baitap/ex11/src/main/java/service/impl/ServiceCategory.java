package service.impl;

import model.CategoryBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICategoryRepository;
import service.IServiceCategory;

import java.util.List;

@Service
public class ServiceCategory implements IServiceCategory {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<CategoryBlog> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryBlog findById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void create(CategoryBlog blog) {
        categoryRepository.save(blog);
    }

    @Override
    public void update(CategoryBlog blog) {
        categoryRepository.save(blog);
    }

    @Override
    public void deleteById(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryBlog> findIDCategory(Integer id) {
        return categoryRepository.selectIntoBlog(id);
    }
}
