package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import com.sstark.generalmarket.infrastructure.mappers.CategoryMapper;
import com.sstark.generalmarket.infrastructure.repositories.CategoryJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresCategoryAdapter implements CategoryRepository {
    private final CategoryJpaRepository repository;
    private final CategoryMapper mapper;

    public PostgresCategoryAdapter(CategoryJpaRepository repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<String> getAllCategories() {
        return repository.getAllCategories();
    }

    @Override
    public List<CategoryWithIdDto> getAllCategoriesWithId() {
        return mapper.toCategoryWithIdDtoList(repository.findAll());
    }

    @Override
    public Category save(Category category) {
        return mapper.toDomainModel(repository.save(mapper.toEntity(category)));
    }

    @Override
    public CategoryDto updateState(CategoryToUpdateDto categoryToUpdateDto) {
        return mapper.toCategoryDto(repository.updateCategoryState(categoryToUpdateDto));
    }
}
