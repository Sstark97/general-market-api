package com.sstark.generalmarket.domain.repositories;

import com.sstark.generalmarket.domain.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findAllByCategoryId(int categoryId);
}
