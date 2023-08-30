package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.MarketPage;
import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.application.repositories.ProductRepository;

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

    public Product save (Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getById(int productId) {
        return productRepository.findByProductId(productId);
    }

    public boolean deleteBy(int productId) {
        if(getById(productId).isPresent()) {
            productRepository.deleteBy(productId);
            return true;
        }

        return false;
    }

    public MarketPage<Product> getAllByPage(int page, int elements) {
        return productRepository.findAllByPage(page, elements);
    }
}
