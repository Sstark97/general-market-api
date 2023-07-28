package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.ProductService;
import com.sstark.generalmarket.domain.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello world!!🤓</h1>";
    }

    @GetMapping("/all")
    public List<Product> products() {
        List<Product> products = productService.findAll();

        return products.stream().toList();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> productsByCategory(@PathVariable int categoryId) {
        List<Product> products = productService.findByCategory(categoryId);

        return products.stream().toList();
    }

    @GetMapping("/name/{productName}")
    public Product productOrderByNameAsc(@PathVariable String productName) {
        Optional<Product> product = productService.findByProductNameAscending(productName);

        if(product.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        return product.get();
    }
}
