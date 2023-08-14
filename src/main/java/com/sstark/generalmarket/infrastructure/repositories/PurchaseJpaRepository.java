package com.sstark.generalmarket.infrastructure.repositories;

import com.sstark.generalmarket.infrastructure.entities.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseJpaRepository extends JpaRepository<Buy, Integer> {
    List<Buy> findByClientId(String clientId);
}
