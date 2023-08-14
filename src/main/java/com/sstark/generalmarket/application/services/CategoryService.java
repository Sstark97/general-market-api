package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;

import java.util.List;

public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<String> getAllCategories() {
        return repository.getAllCategories();
    }

    public List<CategoryWithIdDto> getAllCategoriesWithId() {
        return repository.getAllCategoriesWithId();
    }
}
