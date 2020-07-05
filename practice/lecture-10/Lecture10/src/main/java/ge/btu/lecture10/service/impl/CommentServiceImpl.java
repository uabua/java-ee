package ge.btu.lecture10.service.impl;

import ge.btu.lecture10.DTO.comment.AddCommentInput;
import ge.btu.lecture10.DTO.comment.AddCommentOutput;
import ge.btu.lecture10.model.Comment;
import ge.btu.lecture10.model.Post;
import ge.btu.lecture10.repository.CommentRepository;
import ge.btu.lecture10.repository.PostRepository;
import ge.btu.lecture10.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public AddCommentOutput addComment(AddCommentInput addCommentInput) {
        Post post = postRepository.getOne(addCommentInput.getPostId());
        Comment comment = new Comment();
        comment.setText(addCommentInput.getText());
        comment.setPost(post);
        commentRepository.save(comment);
        AddCommentOutput addCommentOutput = new AddCommentOutput();
        addCommentOutput.setMsg("კომენტარი წარმატებით დაემატა");
        return addCommentOutput;
    }
}