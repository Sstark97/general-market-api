package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.domain.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Test
    public void find_all_products() {
        ProductRepository productRepository = Mockito.mock(ProductRepository.class);
        ProductService productService = new ProductService(productRepository);

        Mockito.when(productRepository.findAll()).thenReturn(Arrays.asList(
                new Product(1,"Product 1", 1,"12345", 10.0, 3, true),
                new Product(2,"Product 2", 1,"2341", 20.0, 4 , false)
        ));

        List<Product> products = productService.findAll().orElseThrow();

        assertEquals(
                Arrays.asList(
                        new Product(1,"Product 1", 1,"12345", 10.0, 3, true),
                        new Product(2,"Product 2", 1,"2341", 20.0, 4 , false)
                ), products
        );
    }

    @Test
    public void find_all_products_by_first_category() {
        ProductRepository productRepository = Mockito.mock(ProductRepository.class);
        ProductService productService = new ProductService(productRepository);
        List<Product> allProducts = Arrays.asList(
                new Product(1,"Product 1", 1,"12345", 10.0, 3, true),
                new Product(2,"Product 2", 2,"2341", 20.0, 4 , false)
        );

        Mockito.when(productRepository.findAllByCategoryId(1)).thenReturn(
                allProducts.stream().filter(product -> product.getCategoryId() == 1).toList()
        );

        List<Product> products = productService.findByCategory(1);

        assertEquals(
                List.of(
                        new Product(1, "Product 1", 1, "12345", 10.0, 3, true)
                ), products
        );
    }
}