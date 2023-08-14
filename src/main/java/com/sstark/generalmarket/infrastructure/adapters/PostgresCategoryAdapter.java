package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.repositories.CategoryJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresCategoryAdapter implements CategoryRepository {
    private final CategoryJpaRepository repository;

    public PostgresCategoryAdapter(CategoryJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> getAllCategories() {
        return repository.getAllCategories();
    }
}
