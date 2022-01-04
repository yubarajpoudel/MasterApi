package com.yuvi.masterapi.controller;

import com.yuvi.masterapi.domain.Category;
import com.yuvi.masterapi.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class CategoryController {
    CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping(value = "/categories")
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    @PostMapping(value = "/categories")
    Category newCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @PutMapping("/categories/{id}")
    Category replaceCategory(@RequestBody Category newCategory, @PathVariable int id) {

        return categoryRepository.findById(id)
                .map(category -> {
                    category.setTitle(newCategory.getTitle());
                    category.setThumbnail(newCategory.getThumbnail());
                    return categoryRepository.save(category);
                })
                .orElseGet(() -> {
                    newCategory.setId(id);
                    return categoryRepository.save(newCategory);
                });
    }

    @DeleteMapping("/categories/{id}")
    void deleteCategory(@PathVariable int id) {
        categoryRepository.deleteById(id);
    }
}
