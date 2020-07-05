package ge.btu.lecture10.service.impl;

import ge.btu.lecture10.DTO.attachment.AttachmentDTO;
import ge.btu.lecture10.DTO.category.CategoryDTO;
import ge.btu.lecture10.DTO.comment.CommentDTO;
import ge.btu.lecture10.DTO.post.*;
import ge.btu.lecture10.model.Attachment;
import ge.btu.lecture10.model.Category;
import ge.btu.lecture10.model.Comment;
import ge.btu.lecture10.model.Post;
import ge.btu.lecture10.repository.CategoryRepository;
import ge.btu.lecture10.repository.PostRepository;
import ge.btu.lecture10.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public GetPostsOutput getPosts(GetPostsInput getPostsInput) {
        List<PostDTO> posts = new ArrayList<>();
        for (Post post : postRepository.findAll()) {
            PostDTO postDTO = new PostDTO();
            postDTO.setId(post.getId());
            postDTO.setTitle(post.getTitle());
            postDTO.setDescription(post.getDescription());
            postDTO.setCreateDate(post.getCreateDate());
            posts.add(postDTO);
        }
        GetPostsOutput getPostsOutput = new GetPostsOutput();
        getPostsOutput.setPosts(posts);
        return getPostsOutput;
    }

    @Override
    public AddPostOutput addPost(AddPostInput addPostInput) {

        Post post = new Post();
        post.setTitle(addPostInput.getTitle());
        post.setDescription(addPostInput.getDescription());
        post.setCreateDate(new Date());
        Attachment attachment = new Attachment();
        attachment.setUrl(addPostInput.getAttachmentDTO().getUrl());
        post.setAttachment(attachment);

        List<Category> categories = new ArrayList<>();
        for (CategoryDTO categoryDTO : addPostInput.getCategories()) {
            Category category = categoryRepository.getOne(categoryDTO.getId());  // აქ შეიძლება კატეგოორიის სახელითაც მოიძებნოს
            categories.add(category);
        }
        post.setCategories(categories);
        postRepository.save(post);

        AddPostOutput addPostOutput = new AddPostOutput();
        addPostOutput.setMsg("პოსტი წარმატებით დაემატა");
        return addPostOutput;
    }

    @Override
    public GetPostDetailsOutput getPostDetails(GetPostDetailInput getPostDetailInput) {
        Post post = postRepository.getOne(getPostDetailInput.getPostId());

        System.out.println(post.getCategories());
        GetPostDetailsOutput getPostDetailsOutput = new GetPostDetailsOutput();
        getPostDetailsOutput.setId(post.getId());
        getPostDetailsOutput.setTitle(post.getTitle());
        getPostDetailsOutput.setDescription(post.getDescription());
        getPostDetailsOutput.setCreateDate(post.getCreateDate());

        AttachmentDTO attachmentDTO = new AttachmentDTO();
        attachmentDTO.setUrl(post.getAttachment().getUrl());
        getPostDetailsOutput.setAttachment(attachmentDTO);
        List<CategoryDTO> categoryDTOS = new ArrayList<>();

        for (Category category : post.getCategories()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setTitle(category.getTitle());
            categoryDTOS.add(categoryDTO);
        }
        getPostDetailsOutput.setCategories(categoryDTOS);

        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (Comment comment : post.getComments()) {
            CommentDTO commentDTO = new CommentDTO();
            commentDTO.setId(comment.getId());
            commentDTO.setText(comment.getText());
            commentDTOS.add(commentDTO);
        }
        getPostDetailsOutput.setComments(commentDTOS);

        return getPostDetailsOutput;
    }

    @Override
    public void deletePost(Long id) {
        Post post = postRepository.getOne(id);
        post.getCategories().clear(); // ეს რომარ გავაკეთოთ კატეგორიებსაც წაგვიშლის. ამიტომ ჯერ მოვაშორებთ კატეგორიებს ამ პოსტს და მერე წავშლით
        postRepository.delete(post);
    }
}
