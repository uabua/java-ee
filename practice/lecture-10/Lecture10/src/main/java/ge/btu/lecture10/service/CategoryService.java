package ge.btu.lecture10.service;

import ge.btu.lecture10.DTO.category.AddCategoryInput;
import ge.btu.lecture10.DTO.category.AddCategoryOutput;
import ge.btu.lecture10.DTO.category.GetCategoriesInput;
import ge.btu.lecture10.DTO.category.GetCategoriesOutput;

public interface CategoryService {
    GetCategoriesOutput getCategories(GetCategoriesInput getCategoriesInput);

    AddCategoryOutput addCategory(AddCategoryInput addCategoryInput);
}
