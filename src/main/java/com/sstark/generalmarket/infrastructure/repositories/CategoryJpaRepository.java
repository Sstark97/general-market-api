package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Integer> {
    @Query(value = "SELECT c.description FROM Category c", nativeQuery = true)
    List<String> getAllCategories();

    @Query(value = "UPDATE CategoryEntity SET state = :#{#categoryToUpdateDto.state()} WHERE categoryId = :#{#categoryToUpdateDto.id()}")
    @Modifying
    void updateCategoryState(@Param("categoryToUpdateDto")CategoryToUpdateDto categoryToUpdateDto);
}
