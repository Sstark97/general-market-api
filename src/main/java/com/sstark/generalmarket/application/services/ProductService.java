package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.domain.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<List<Product>> findAll() {
        List<Product> products = productRepository.findAll();

        return products.isEmpty() ? Optional.empty() : Optional.of(products);
    }

    public List<Product> findByCategory(int categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}
