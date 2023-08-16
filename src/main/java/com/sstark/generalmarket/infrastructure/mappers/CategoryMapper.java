package com.sstark.generalmarket.infrastructure.mappers;

import com.sstark.generalmarket.domain.models.Category;
import com.sstark.generalmarket.infrastructure.dto.CategoryDto;
import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import com.sstark.generalmarket.infrastructure.entities.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(target = "id", source = "categoryId"),
            @Mapping(target = "description", source = "description")
    })
    CategoryWithIdDto toCategoryWithIdDto(CategoryEntity category);

    List<CategoryWithIdDto> toCategoryWithIdDtoList(List<CategoryEntity> categories);

    @Mappings({
            @Mapping(target = "description", source = "description"),
            @Mapping(target = "state", source = "state")
    })
    Category toDomainModel(CategoryEntity category);

    @InheritInverseConfiguration
    CategoryEntity toEntity(Category category);

    @Mappings({
            @Mapping(target = "id", source = "categoryId"),
            @Mapping(target = "title", source = "description"),
            @Mapping(target = "state", source = "state")
    })
    CategoryDto toCategoryDto(CategoryEntity category);
}
