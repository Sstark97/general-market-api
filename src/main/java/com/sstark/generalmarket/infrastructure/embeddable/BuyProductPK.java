package com.sstark.generalmarket.infrastructure.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BuyProductPK implements Serializable {
    @Column(name = "buy_id")
    private Integer buyId;

    @Column(name = "product_id")
    private Integer productId;

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
