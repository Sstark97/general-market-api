package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.PurchaseService;
import com.sstark.generalmarket.domain.models.Purchase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/all/{clientId}")
    public ResponseEntity<List<Purchase>> getAllPurchasesByClient(@PathVariable String clientId) {
        return ResponseEntity.ok(purchaseService.getByClient(clientId));
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> saveAPurchase(@RequestBody Purchase purchase) {
        return ResponseEntity.ok(purchaseService.save(purchase));
    }
}
