package ge.btu.lecture10.DTO.category;

import lombok.Data;

import java.util.List;

@Data
public class GetCategoriesOutput {
    List<CategoryDTO> categories;
}
