package com.sstark.generalmarket.infrastructure.dto;

public class CategoryWithNumberOfProductsDto {
    private Integer id;
    private String description;
    private Integer numberOfProducts;

    public CategoryWithNumberOfProductsDto(Integer id, String description, Integer numberOfProducts) {
        this.id = id;
        this.description = description;
        this.numberOfProducts = numberOfProducts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(Integer numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
}
