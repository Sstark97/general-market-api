package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.CategoryService;
import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllCategories() {
        return ResponseEntity.ok(service.getAllCategories());
    }

    @GetMapping("/allWithId")
    public ResponseEntity<List<CategoryWithIdDto>> getAllCategoriesWithId() {
        return ResponseEntity.ok(service.getAllCategoriesWithId());
    }

    @PostMapping("/save")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
        return ResponseEntity.ok(service.save(category));
    }

    @PutMapping("/update")
    public ResponseEntity<CategoryDto> updateCategoryState(@RequestBody CategoryToUpdateDto categoryToUpdate) {
        return ResponseEntity.of(service.updateCategoryState(categoryToUpdate));
    }
}
