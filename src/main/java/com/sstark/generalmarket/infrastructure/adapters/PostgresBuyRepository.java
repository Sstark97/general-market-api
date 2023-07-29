package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.domain.repositories.PurchaseRepository;
import com.sstark.generalmarket.infrastructure.repositories.PurchaseJPARepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresBuyRepository implements PurchaseRepository {
    private final PurchaseJPARepository repository;

    public PostgresBuyRepository(PurchaseJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Purchase> getAll() {
        return null;
    }
}
