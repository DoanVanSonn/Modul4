package codegym.vn.ss6.repository;

import codegym.vn.ss6.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
