package com.sstark.generalmarket.application.repositories;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithNumberOfProductsDto;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    List<String> getAllCategories();
    List<CategoryWithIdDto> getAllCategoriesWithId();
    Category save(Category category);

    Optional<CategoryDto> updateState(CategoryToUpdateDto categoryToUpdateDto);

    List<CategoryWithNumberOfProductsDto> getTheCategoriesWithMoreProducts(Integer numberOfCategories);
}
