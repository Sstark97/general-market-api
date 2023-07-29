package com.sstark.generalmarket.infrastructure.mappers;

import com.sstark.generalmarket.domain.models.Purchase;
import com.sstark.generalmarket.domain.models.PurchaseItem;
import com.sstark.generalmarket.infrastructure.entities.Buy;
import com.sstark.generalmarket.infrastructure.entities.BuyProduct;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @Mapping(source = "buyId", target = "purchaseId"),
            @Mapping(source = "halfPayment", target = "paymentMethod"),
            @Mapping(source = "buyProducts", target = "items")
    })
    Purchase toPurchase(Buy purchase);
    List<Purchase> toPurchases(List<Buy> purchases);

    @InheritInverseConfiguration
    @Mapping(target = "client", ignore = true)
    Buy toBuy(Purchase purchase);
}
