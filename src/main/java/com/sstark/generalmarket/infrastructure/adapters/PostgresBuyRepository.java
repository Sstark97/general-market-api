package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.domain.repositories.PurchaseRepository;
import com.sstark.generalmarket.infrastructure.mappers.PurchaseMapper;
import com.sstark.generalmarket.infrastructure.repositories.PurchaseJPARepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PostgresBuyRepository implements PurchaseRepository {
    private final PurchaseJPARepository repository;
    private final PurchaseMapper mapper;

    public PostgresBuyRepository(PurchaseJPARepository repository, PurchaseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases(repository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return Optional.empty();
    }
}
