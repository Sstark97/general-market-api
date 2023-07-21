package com.sstark.generalmarket.infrastructure.entities;

import com.sstark.generalmarket.infrastructure.embeddable.BuyProductPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Buy_Product")
public class BuyProduct {
    @EmbeddedId
    private BuyProductPK id;

    private Integer amount;

    private Double total;

    private Boolean state;

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
}
