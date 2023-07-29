package com.sstark.generalmarket.domain.models;

public class PurchaseItem {
    private int productId;
    private int quantity;
    private double total;
    private boolean active;

    public PurchaseItem(int productId, int quantity, double total, boolean active) {
        this.productId = productId;
        this.quantity = quantity;
        this.total = total;
        this.active = active;
    }
}
