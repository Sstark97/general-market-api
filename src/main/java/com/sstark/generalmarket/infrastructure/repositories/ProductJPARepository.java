package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductJPARepository extends JpaRepository<ProductEntity, Integer> {
    List<Product> findByCategoryId(int categoryId);
}
