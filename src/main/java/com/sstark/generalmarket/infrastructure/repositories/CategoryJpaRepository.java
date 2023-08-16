package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.dto.CategoryToUpdateDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithNumberOfProductsDto;
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

    @Query(value = "SELECT c.category_id AS categoryId, c.description, COUNT(p) AS numberOfProducts " +
            "FROM Category c " +
            "INNER JOIN Product p " +
            "ON c.category_id = p.category_id " +
            "GROUP BY c.category_id " +
            "ORDER BY numberOfProducts DESC " +
            "LIMIT :numberOfCategories",
            nativeQuery = true
    )
    List<CategoryWithNumberOfProductsDto> findTheCategoriesWithMoreProducts(@Param("numberOfCategories") Integer numberOfCategories);
}
