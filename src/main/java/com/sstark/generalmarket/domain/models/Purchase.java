package com.sstark.generalmarket.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private int purchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> items;

    public Purchase(int purchaseId, String clientId, LocalDateTime date, String paymentMethod, String comment, String state, List<PurchaseItem> items) {
        this.purchaseId = purchaseId;
        this.clientId = clientId;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.comment = comment;
        this.state = state;
        this.items = items;
    }
}
