package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.application.repositories.PurchaseRepository;
import com.sstark.generalmarket.infrastructure.entities.Buy;
import com.sstark.generalmarket.infrastructure.mappers.PurchaseMapper;
import com.sstark.generalmarket.infrastructure.repositories.PurchaseJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresBuyRepository implements PurchaseRepository {
    private final PurchaseJpaRepository repository;
    private final PurchaseMapper mapper;

    public PostgresBuyRepository(PurchaseJpaRepository repository, PurchaseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases(repository.findAll());
    }

    @Override
    public List<Purchase> getByClient(String clientId) {
        return mapper.toPurchases(repository.findByClientId(clientId));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Buy buy = mapper.toBuy(purchase);
        System.out.println(buy);
        buy.getBuyProducts().forEach(product -> { product.setBuy(buy);});

        return mapper.toPurchase(repository.save(buy));
    }
}
