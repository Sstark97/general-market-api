package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.repositories.PurchaseRepository;

public class PurchaseService {
    private PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
}
