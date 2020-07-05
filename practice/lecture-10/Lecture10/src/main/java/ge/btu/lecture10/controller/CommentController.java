package ge.btu.lecture10.controller;

import ge.btu.lecture10.DTO.comment.AddCommentInput;
import ge.btu.lecture10.DTO.comment.AddCommentOutput;
import ge.btu.lecture10.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/CommentController")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("comment")
    public AddCommentOutput addComment(@RequestBody AddCommentInput addCommentInput) {
        return commentService.addComment(addCommentInput);
    }
}