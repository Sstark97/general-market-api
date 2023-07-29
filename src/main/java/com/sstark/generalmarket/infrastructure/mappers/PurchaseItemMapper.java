package com.sstark.generalmarket.infrastructure.mappers;

import com.sstark.generalmarket.domain.models.PurchaseItem;
import com.sstark.generalmarket.infrastructure.entities.BuyProduct;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.productId", target = "productId"),
            @Mapping(source = "amount", target = "quantity"),
            @Mapping(source = "state", target = "active")
    })
    PurchaseItem toPurchaseItem(BuyProduct purchaseItem);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "buy", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.buyId", ignore = true)
    })
    BuyProduct toBuyProduct(PurchaseItem purchaseItem);
}
