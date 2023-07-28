package com.sstark.generalmarket.infrastructure.mappers;

import com.sstark.generalmarket.domain.models.Product;
import com.sstark.generalmarket.infrastructure.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(target = "productId", source = "productId"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "categoryId", source = "categoryId"),
            @Mapping(target = "barcode", source = "barcode"),
            @Mapping(target = "salePrice", source = "salePrice"),
            @Mapping(target = "stock", source = "stock"),
            @Mapping(target = "state", source = "state")
    })
    Product toProduct(ProductEntity productEntity);
    List<Product> toProducts(List<ProductEntity> productEntities);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(Product product);
}
