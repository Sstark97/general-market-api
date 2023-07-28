package com.sstark.generalmarket.domain.repositories;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.infrastructure.entities.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findAllByCategoryId(int categoryId);
    Optional<Product> findByProductNameAscending(String productName);

    Product save(Product productToSave);
}
