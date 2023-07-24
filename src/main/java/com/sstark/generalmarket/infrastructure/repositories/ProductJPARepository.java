package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJPARepository extends JpaRepository<ProductEntity, Integer> {
}
