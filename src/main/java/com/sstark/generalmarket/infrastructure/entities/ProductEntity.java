package com.sstark.generalmarket.infrastructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    private String name;

    @Column(name = "category_id")
    private Integer categoryId;

    private String barcode;

    @Column(name = "sale_price")
    private Double salePrice;

    private Integer stock;

    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;

    public ProductEntity(Integer productId, String name, Integer categoryId, String barcode, Double salePrice, Integer stock, Boolean state) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.barcode = barcode;
        this.salePrice = salePrice;
        this.stock = stock;
        this.state = state;
    }

    public ProductEntity() {}

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
