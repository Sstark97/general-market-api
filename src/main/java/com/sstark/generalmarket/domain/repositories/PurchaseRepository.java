package com.sstark.generalmarket.domain.repositories;

import com.sstark.generalmarket.domain.models.Purchase;

import java.util.List;

public interface PurchaseRepository {
    List<Purchase> getAll();
    List<Purchase> getByClient(String clientId);
/*    Purchase save(Purchase purchase);*/
}
