package com.sstark.generalmarket.infrastructure.configuration;

import com.sstark.generalmarket.application.services.ProductService;
import com.sstark.generalmarket.domain.repositories.ProductRepository;
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
}
