package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<Category, Integer> {
}
