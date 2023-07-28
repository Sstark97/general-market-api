package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJPARepository extends JpaRepository<ProductEntity, Integer> {
}
