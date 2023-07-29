package com.sstark.generalmarket.infrastructure.entities;

import com.sstark.generalmarket.infrastructure.embeddable.BuyProductPK;
import jakarta.persistence.*;

@Entity
@Table(name = "Buy_Product")
public class BuyProduct {
    @EmbeddedId
    private BuyProductPK id;

    private Integer amount;

    private Double total;

    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "buy_id", insertable = false, updatable = false)
    private Buy buy;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;

    public BuyProductPK getId() {
        return id;
    }

    public void setId(BuyProductPK id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Buy getBuy() {
        return buy;
    }

    public ProductEntity getProduct() {
        return product;
    }
}
