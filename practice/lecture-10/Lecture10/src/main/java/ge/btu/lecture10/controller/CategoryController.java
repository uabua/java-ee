package ge.btu.lecture10.controller;

import ge.btu.lecture10.DTO.category.AddCategoryInput;
import ge.btu.lecture10.DTO.category.AddCategoryOutput;
import ge.btu.lecture10.DTO.category.GetCategoriesInput;
import ge.btu.lecture10.DTO.category.GetCategoriesOutput;
import ge.btu.lecture10.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/CategoryController")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("categories")
    public GetCategoriesOutput getCategories(@RequestBody GetCategoriesInput getCategoriesInput) {
        return categoryService.getCategories(getCategoriesInput);
    }

    @PostMapping("category")
    public AddCategoryOutput addCategory(@RequestBody AddCategoryInput addCategoryInput) {
        return categoryService.addCategory(addCategoryInput);
    }
}
