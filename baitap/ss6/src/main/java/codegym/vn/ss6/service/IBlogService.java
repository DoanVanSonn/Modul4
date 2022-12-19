package codegym.vn.ss6.service;

import codegym.vn.ss6.bean.Blog;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    void save(Blog blog);
    void update(Blog blog);
    Blog findByIdMy(int id);
    void deleteById(int id);
    Page<Blog> findAll(Pageable pageable);
}
