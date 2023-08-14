package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
