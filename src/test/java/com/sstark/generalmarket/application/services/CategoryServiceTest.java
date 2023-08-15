package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

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
        Mockito.when(repository.updateState(1, false)).thenReturn(new CategoryDto(1,"irrelevant",false));

        CategoryDto categoryUpdated = service.updateCategoryState(1, false);

        assertFalse(categoryUpdated.getState());
    }
}
