package com.sstark.generalmarket.infrastructure.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buy_id")
    private Integer buyId;

    @Column(name = "client_id")
    private String clientId;

    private LocalDateTime date;

    @Column(name = "half_payment")
    private String halfPayment;

    private String comment;

    private String state;

    @ManyToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private Client client;

    @OneToMany(mappedBy = "buy")
    private List<BuyProduct> buyProducts;

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getHalfPayment() {
        return halfPayment;
    }

    public void setHalfPayment(String halfPayment) {
        this.halfPayment = halfPayment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
