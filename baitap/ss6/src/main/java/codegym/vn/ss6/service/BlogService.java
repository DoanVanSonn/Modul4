package codegym.vn.ss6.service;

import codegym.vn.ss6.bean.Blog;
import codegym.vn.ss6.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service("BlogService")
public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository blogRepository;

    @Override
    public List<Blog> getAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
blogRepository.save(blog);
    }

    @Override
    public void update( Blog blog) {
blogRepository.save(blog);
    }

    @Override
    public Blog findByIdMy(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return null;
    }
}
