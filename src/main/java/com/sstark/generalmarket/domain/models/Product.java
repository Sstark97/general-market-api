package com.sstark.generalmarket.domain.models;

import java.util.Objects;

public class Product {

    private Integer productId;

    private String name;

    private Integer categoryId;

    private String barcode;

    private Double salePrice;

    private Integer stock;

    private Boolean state;

    public Product(Integer productId, String name, Integer categoryId, String barcode, Double salePrice, Integer stock, Boolean state) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.barcode = barcode;
        this.salePrice = salePrice;
        this.stock = stock;
        this.state = state;
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", barcode='" + barcode + '\'' +
                ", salePrice=" + salePrice +
                ", stock=" + stock +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) && Objects.equals(name, product.name) && Objects.equals(categoryId, product.categoryId) && Objects.equals(barcode, product.barcode) && Objects.equals(salePrice, product.salePrice) && Objects.equals(stock, product.stock) && Objects.equals(state, product.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, categoryId, barcode, salePrice, stock, state);
    }
}
