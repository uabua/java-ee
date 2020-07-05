package ge.btu.lecture10.DTO.post;

import ge.btu.lecture10.DTO.attachment.AttachmentDTO;
import ge.btu.lecture10.DTO.category.CategoryDTO;
import ge.btu.lecture10.DTO.comment.CommentDTO;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class GetPostDetailsOutput {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
    private List<CommentDTO> comments = new ArrayList<>();
    private List<CategoryDTO> categories = new ArrayList<>();
    private AttachmentDTO attachment;
}
