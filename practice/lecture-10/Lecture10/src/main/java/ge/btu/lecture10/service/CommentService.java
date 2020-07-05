package ge.btu.lecture10.service;

import ge.btu.lecture10.DTO.comment.AddCommentInput;
import ge.btu.lecture10.DTO.comment.AddCommentOutput;

public interface CommentService {
    AddCommentOutput addComment(AddCommentInput addCommentInput);
}
