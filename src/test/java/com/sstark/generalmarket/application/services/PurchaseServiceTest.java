package com.sstark.generalmarket.application.services;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.domain.models.PurchaseItem;
import com.sstark.generalmarket.domain.repositories.PurchaseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PurchaseServiceTest {
    @Test
    public void get_all_purchases() {
        PurchaseRepository purchaseRepository = Mockito.mock(PurchaseRepository.class);
        PurchaseService purchaseService = new PurchaseService(purchaseRepository);

        List<Purchase> purchases = Arrays.asList(
                new Purchase(1, "1", LocalDateTime.now(), "bank", "comment", "pay",
                        List.of(
                                new PurchaseItem(1, 2, 23.3, true)
                        )),
                new Purchase(2, "2", LocalDateTime.now(), "bank", "comment", "pay",
                        List.of(
                                new PurchaseItem(1, 2, 23.3, true)
                        ))
        );
        Mockito.when(purchaseRepository.getAll()).thenReturn(purchases);

        assertEquals(purchases, purchaseService.getAll());
    }

    @Test
    public void get_purchases_by_client() {
        PurchaseRepository purchaseRepository = Mockito.mock(PurchaseRepository.class);
        PurchaseService purchaseService = new PurchaseService(purchaseRepository);

        List<Purchase> purchasesByClient = Arrays.asList(
                new Purchase(1, "1", LocalDateTime.now(), "bank", "comment", "pay",
                        List.of(
                                new PurchaseItem(1, 2, 23.3, true)
                        ))
        );

        Mockito.when(purchaseRepository.getByClient("1")).thenReturn(Optional.of(purchasesByClient));

        assertEquals(purchaseService.getByClient("1"), purchasesByClient);
    }
}