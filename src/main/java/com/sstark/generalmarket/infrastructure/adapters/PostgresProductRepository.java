package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.domain.repositories.ProductRepository;
import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import com.sstark.generalmarket.infrastructure.repositories.ProductJPARepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresProductRepository implements ProductRepository {
    private final ProductJPARepository repository;

    public PostgresProductRepository(ProductJPARepository repository) {
        this.repository = repository;
    }

    private Product entityToProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getProductId(),
                productEntity.getName(),
                productEntity.getCategoryId(),
                productEntity.getBarcode(),
                productEntity.getSalePrice(),
                productEntity.getStock(),
                productEntity.getState()
        );
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(this::entityToProduct).toList();
    }

    @Override
    public List<Product> findAllByCategoryId(int categoryId) {
        throw new RuntimeException("Not implemented yet");
    }
}
