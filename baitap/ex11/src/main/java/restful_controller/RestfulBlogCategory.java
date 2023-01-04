package restful_controller;

import model.Blog;
import model.CategoryBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IServiceBlog;
import service.IServiceCategory;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class RestfulBlogCategory {
    @Autowired
    private IServiceBlog serviceBlog;
    @Autowired
    private IServiceCategory serviceCategory;

    @GetMapping("/list-category")
    public ResponseEntity<List<CategoryBlog>> getListCategory() {
        return new ResponseEntity<>(serviceCategory.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list-blog")
    public ResponseEntity<List<Blog>> getListBlog() {
        return new ResponseEntity<>(serviceBlog.findAll(), HttpStatus.OK);
    }
    @GetMapping("/list-blogIntoCategory/{id}")
    public List<Blog> getBlogIdCategory(@PathVariable("id")Integer id) {
        return serviceBlog.listQueryCategory(id);
    }
    @GetMapping("/findByidBlog/{id}")
    public Blog showBlog(@PathVariable("id") Integer id){
        return serviceBlog.findById(id);
    }
}
