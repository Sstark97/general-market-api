package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithNumberOfProductsDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryServiceTest {
    CategoryRepository repository;
    CategoryService service;
    @BeforeEach
    public void setup() {
        repository = Mockito.mock(CategoryRepository.class);
        service = new CategoryService(repository);
    }
    @Test
    public void get_all_categories(){
        Mockito.when(repository.getAllCategories()).thenReturn(Arrays.asList(
                "category 1",
                "category 2",
                "category 3",
                "category 4"
        ));

        List<String> allCategories = service.getAllCategories();

        assertEquals(allCategories, Arrays.asList(
                "category 1",
                "category 2",
                "category 3",
                "category 4"
        ));
    }

    @Test
    public void get_all_categories_with_id(){
        Mockito.when(repository.getAllCategoriesWithId()).thenReturn(Arrays.asList(
                new CategoryWithIdDto(1, "category 1"),
                new CategoryWithIdDto(2, "category 2"),
                new CategoryWithIdDto(3, "category 3"),
                new CategoryWithIdDto(4, "category 4")
        ));

        List<CategoryWithIdDto> allCategories = service.getAllCategoriesWithId();

        assertEquals(allCategories, Arrays.asList(
                new CategoryWithIdDto(1, "category 1"),
                new CategoryWithIdDto(2, "category 2"),
                new CategoryWithIdDto(3, "category 3"),
                new CategoryWithIdDto(4, "category 4")
        ));
    }

    @Test
    public void save_a_new_category() {
        Category category = new Category("Category 1", true);
        Mockito.when(repository.save(category)).thenReturn(category);

        Category categorySaved = service.save(category);

        assertEquals(categorySaved, category);
    }

    @Test
    public void update_a_category_state(){
        CategoryToUpdateDto categoryToUpdateDto = new CategoryToUpdateDto(1, false);
        Mockito.when(repository.updateState(categoryToUpdateDto)).thenReturn(Optional.of(new CategoryDto(1,"irrelevant",false)));

        Optional<CategoryDto> categoryUpdated = service.updateCategoryState(categoryToUpdateDto);

        assertTrue(categoryUpdated.isPresent());
        assertFalse(categoryUpdated.get().getState());
    }

    @Test
    public void get_the_three_categories_with_more_products() {
        record CategoryWithNumberOfProducts(Integer id, String Description, Integer numberOfProducts) implements CategoryWithNumberOfProductsDto {
            @Override
            public Integer getCategoryId() {
                return null;
            }

            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public Integer getNumberOfProducts() {
                return null;
            }
        }

        List<CategoryWithNumberOfProductsDto> categoriesWithNumberOfProducts = Arrays.asList(
                new CategoryWithNumberOfProducts(1, "category 1", 5),
                new CategoryWithNumberOfProducts(2, "category 2", 3),
                new CategoryWithNumberOfProducts(3, "category 3", 6),
                new CategoryWithNumberOfProducts(4, "category 4", 1)
        );
        Mockito.when(repository.getTheCategoriesWithMoreProducts(2)).thenReturn(Arrays.asList(
                categoriesWithNumberOfProducts.get(0),
                categoriesWithNumberOfProducts.get(2)
        ));

        List<CategoryWithNumberOfProductsDto> categoriesWithProductsResult = service.getTheCategoriesWithMoreProducts(2);

        assertEquals(categoriesWithProductsResult, Arrays.asList(
                categoriesWithNumberOfProducts.get(0),
                categoriesWithNumberOfProducts.get(2)
        ));
    }
}
