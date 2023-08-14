package com.sstark.generalmarket.application.services;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryServiceTest {
    @Test
    public void get_all_categories(){
        CategorieRepository repository = Mockito.mock(CategoryRepository.class);
        CategoryService service = new CategoryService(repository);
        Mockito.when(repository.getAllCategories).thenReturn(Arrays.asList(
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
}
