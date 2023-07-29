package com.sstark.generalmarket.infrastructure.controllers;

import com.sstark.generalmarket.application.services.ProductService;
import com.sstark.generalmarket.domain.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Product>> products() {

        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> productsByCategory(@PathVariable int categoryId) {

        return new ResponseEntity<>(productService.findByCategory(categoryId), HttpStatus.OK);
    }

    @GetMapping("/name/{productName}")
    public ResponseEntity<Product> productOrderByNameAsc(@PathVariable String productName) {
        Optional<Product> product = productService.findByProductNameAscending(productName);

        return ResponseEntity.of(product);
    }

    @GetMapping("/id/{productId}")
    public ResponseEntity<Product> productById(@PathVariable int productId) {
        Optional<Product> product = productService.getById(productId);

        return ResponseEntity.of(product);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.OK);
    }

    @DeleteMapping("/id/{productId}")
    public ResponseEntity deleteById(@PathVariable int productId) {
        HttpStatus status = productService.deleteBy(productId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity(status);
    }
}
