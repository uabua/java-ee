package ge.btu.lecture10.DTO.comment;

import lombok.Data;

@Data
public class AddCommentInput {
    private Long postId;
    private String text;
}
