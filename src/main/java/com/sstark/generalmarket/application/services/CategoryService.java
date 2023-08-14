package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<String> getAllCategories() {
        return repository.getAllCategories();
    }
}
