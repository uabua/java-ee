package ge.btu.lecture09;

import ge.btu.lecture09.model.*;
import ge.btu.lecture09.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    @GetMapping("/test")
    public void test() {
//        Student student = new Student();
//        //student.setId(1L);
//        student.setUsername("uabua");
//        student.setFirstName("Mariami");
//        student.setLastName("Chakhvadze");
//        student.setAge(20);
//
//        studentRepository.save(student);
//        System.out.println("ok");


        List<Category> categoryList = new ArrayList<>();
        categoryList.add(categoryRepository.getOne(1L));
        categoryList.add(categoryRepository.getOne(2L));

        Attachment attachment = new Attachment();
        attachment.setUrl("https://btu.ge");

        Post post = new Post();
        post.setTitle("test title 1");
        post.setDescription("test description");
        post.setCreateDate(new Date());
        post.setRate(5);
        post.setAttachment(attachment);
        post.setCategories(categoryList);
        postRepository.save(post);
        System.out.println("ok");
    }

    @GetMapping("/addComment")
    public void addComment() {
        Post post = postRepository.getOne(1L);

        Comment comment = new Comment();
        comment.setText("test comment 1");
        comment.setPost(post);
        commentRepository.save(comment);
        System.out.println("ok");
    }

    @GetMapping("/addCategory")
    public void addCategory() {
        Category category = new Category();
        category.setTitle("Category 0");

        Category category1 = new Category();
        category1.setTitle("Category 1");

        categoryRepository.save(category);
        categoryRepository.save(category1);
    }
}
