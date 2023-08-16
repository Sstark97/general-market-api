package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import com.sstark.generalmarket.infrastructure.entities.CategoryEntity;
import com.sstark.generalmarket.infrastructure.mappers.CategoryMapper;
import com.sstark.generalmarket.infrastructure.repositories.CategoryJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
    @Transactional
    public Optional<CategoryDto> updateState(CategoryToUpdateDto categoryToUpdateDto) {
        Optional<CategoryEntity> categoryEntity = repository.findById(categoryToUpdateDto.id());

        if(categoryEntity.isPresent()) {
            CategoryEntity category = categoryEntity.get();
            category.setState(categoryToUpdateDto.state());
            repository.updateCategoryState(categoryToUpdateDto);
            return Optional.of(mapper.toCategoryDto(category));
        }

        return Optional.empty();
    }
}
