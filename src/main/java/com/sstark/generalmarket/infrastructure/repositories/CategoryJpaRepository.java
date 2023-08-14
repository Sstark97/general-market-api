package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryJpaRepository extends JpaRepository<Category, Integer> {
    @Query(value = "SELECT c.description FROM Category c", nativeQuery = true)
    List<String> getAllCategories();
}
