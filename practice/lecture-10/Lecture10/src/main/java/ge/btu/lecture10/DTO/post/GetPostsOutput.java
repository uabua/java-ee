package ge.btu.lecture10.DTO.post;

import lombok.Data;

import java.util.List;

@Data
public class GetPostsOutput {
    List<PostDTO> posts;
}
