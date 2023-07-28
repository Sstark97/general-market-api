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

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByCategory(int categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }

    public Optional<Product> findByProductNameAscending(String name) {
        return productRepository.findByProductNameAscending(name);
    }
}
