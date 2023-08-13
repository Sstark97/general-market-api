package com.sstark.generalmarket.infrastructure.mappers;

import com.sstark.generalmarket.domain.models.MarketPage;
import com.sstark.generalmarket.domain.models.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface PageMapper {
    @Mappings({
            @Mapping(target = "content", source = "content"),
            @Mapping(target = "pageNumber", source = "pageable.pageNumber"),
            @Mapping(target = "totalElements", source = "totalElements"),
            @Mapping(target = "totalPages", source = "totalPages"),
            @Mapping(target = "last", source = "last"),
            @Mapping(target = "pageSize", source = "size"),
    })
    MarketPage<Product> toMarketPage(Page<Product> productPage);
}
