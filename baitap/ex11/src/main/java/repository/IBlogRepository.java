package repository;

import model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository  extends JpaRepository<Blog, Integer> {
    @Query("select b.id, b.name, b.content, b.categoryBlog.idCategory from blog b  where  b.categoryBlog.idCategory= :idCategoryParam")
    List<Blog> listQueryCategory(@Param("idCategoryParam") Integer idCategoryParam);
    List<Blog> findAllByCategoryBlog_IdCategory(Integer id);
}
