package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.application.repositories.PurchaseRepository;

import java.util.List;

public class PurchaseService {
    private final PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }

    public List<Purchase> getByClient(String clientId) {
        return purchaseRepository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }
}
