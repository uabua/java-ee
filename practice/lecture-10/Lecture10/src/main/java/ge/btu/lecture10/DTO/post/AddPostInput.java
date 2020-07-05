package ge.btu.lecture10.DTO.post;

import ge.btu.lecture10.DTO.attachment.AttachmentDTO;
import ge.btu.lecture10.DTO.category.CategoryDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AddPostInput {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
    private List<CategoryDTO> categories;
    private AttachmentDTO attachmentDTO;
}
