package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.PurchaseService;
import com.sstark.generalmarket.domain.models.Purchase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAllPurchase() {
        return ResponseEntity.ok(purchaseService.getAll());
    }
}
