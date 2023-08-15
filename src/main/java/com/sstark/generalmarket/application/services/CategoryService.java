package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;

import java.util.List;
import java.util.Optional;

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

    public Category save(Category category) {
        return repository.save(category);
    }

    public Optional<CategoryDto> updateCategoryState(CategoryToUpdateDto categoryToUpdateDto) {
        return repository.updateState(categoryToUpdateDto);
    }
}
