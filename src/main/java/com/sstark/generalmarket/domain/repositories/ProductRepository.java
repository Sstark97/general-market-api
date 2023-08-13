package com.sstark.generalmarket.domain.repositories;

import com.sstark.generalmarket.domain.models.MarketPage;
import com.sstark.generalmarket.domain.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findAllByCategoryId(int categoryId);
    Optional<Product> findByProductNameAscending(String productName);
    Optional<Product> findByProductId(int productId);
    Product save(Product productToSave);
    void deleteBy(int productId);

    MarketPage<Product> findAllByPage(int page, int elements);
}
