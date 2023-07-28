package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.ProductService;
import com.sstark.generalmarket.domain.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello world!!🤓</h1>";
    }

    @GetMapping("/products")
    public String products() {
        Optional<List<Product>> products = productService.findAll();

        return products.isEmpty() ? "No products found" : products.stream().toList().toString();
    }
}
