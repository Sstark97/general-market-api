package com.sstark.generalmarket.infrastructure.adapters;

import com.sstark.generalmarket.domain.models.MarketPage;
import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.domain.repositories.ProductRepository;
import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import com.sstark.generalmarket.infrastructure.mappers.PageMapper;
import com.sstark.generalmarket.infrastructure.mappers.ProductMapper;
import com.sstark.generalmarket.infrastructure.repositories.ProductJPARepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PostgresProductRepository implements ProductRepository {
    private final ProductJPARepository repository;
    private final ProductMapper mapper;
    private final PageMapper pageMapper;

    public PostgresProductRepository(ProductJPARepository repository, ProductMapper mapper, PageMapper pageMapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.pageMapper = pageMapper;
    }

    @Override
    public List<Product> findAll() {
        return mapper.toProducts(this.repository.findAll());
    }

    @Override
    public List<Product> findAllByCategoryId(int categoryId) {
        return repository.findByCategoryId(categoryId);
    }

    @Override
    public Optional<Product> findByProductNameAscending(String productName) {
        return repository.findByNameOrderByNameAsc(productName);
    }

    @Override
    public Optional<Product> findByProductId(int productId) {
        Optional<ProductEntity> productToFind = repository.findById(productId);

        return productToFind.map(mapper::toProduct);
    }

    @Override
    public Product save(Product productToSave) {
        ProductEntity productEntity = mapper.toProductEntity(productToSave);
        return mapper.toProduct(repository.save(productEntity));
    }

    @Override
    public void deleteBy(int productId) {
        repository.deleteById(productId);
    }

    @Override
    public MarketPage<Product> findAllByPage(int page, int elements) {
        Pageable pageable = PageRequest.of(page, elements);
        return pageMapper.toMarketPage(repository.findAll(pageable).map(mapper::toProduct));
    }
}
