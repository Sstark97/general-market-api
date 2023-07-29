package com.sstark.generalmarket.domain.repositories;

import com.sstark.generalmarket.domain.models.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
/*    Purchase save(Purchase purchase);*/
}
