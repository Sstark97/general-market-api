package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.domain.repositories.PurchaseRepository;

import java.util.List;

public class PurchaseService {
    private final PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }
}
