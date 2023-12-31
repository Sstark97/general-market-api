package com.sstark.generalmarket.infrastructure.configuration;

import com.sstark.generalmarket.application.services.CategoryService;
import com.sstark.generalmarket.application.services.ProductService;
import com.sstark.generalmarket.application.services.PurchaseService;
import com.sstark.generalmarket.application.repositories.CategoryRepository;
import com.sstark.generalmarket.application.repositories.ProductRepository;
import com.sstark.generalmarket.application.repositories.PurchaseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sstark.generalmarket")
public class BeanConfiguration {
    @Bean
    ProductService productService(final ProductRepository productRepository) {
        return new ProductService(productRepository);
    }

    @Bean
    PurchaseService purchaseService(final PurchaseRepository purchaseRepository) {
        return new PurchaseService(purchaseRepository);
    }

    @Bean
    CategoryService categoryService(final CategoryRepository categoryRepository) {
        return new CategoryService(categoryRepository);
    }
}
