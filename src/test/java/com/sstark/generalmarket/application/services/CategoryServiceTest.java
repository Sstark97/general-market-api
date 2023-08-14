package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryServiceTest {
    @Test
    public void get_all_categories(){
        CategoryRepository repository = Mockito.mock(CategoryRepository.class);
        CategoryService service = new CategoryService(repository);
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
        CategoryRepository repository = Mockito.mock(CategoryRepository.class);
        CategoryService service = new CategoryService(repository);
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
}
