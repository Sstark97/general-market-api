package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.domain.repositories.ProductRepository;
import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import com.sstark.generalmarket.infrastructure.repositories.ProductJPARepository;

import java.util.List;

public class PostgresProductRepository implements ProductRepository {
    private final ProductJPARepository repository;

    public PostgresProductRepository(ProductJPARepository repository) {
        this.repository = repository;
    }

    private Product entityToProduct(ProductEntity productEntity) {
        Product product = new Product();
        product.setProductId(productEntity.getProductId());
        product.setName(productEntity.getName());
        product.setSalePrice(productEntity.getSalePrice());
        product.setStock(productEntity.getStock());
        product.setState(productEntity.getState());
        return product;
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(this::entityToProduct).toList();
    }
}
