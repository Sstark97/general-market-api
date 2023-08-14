package com.sstark.generalmarket.infrastructure.mappers;

import com.sstark.generalmarket.infrastructure.dto.CategoryWithIdDto;
import com.sstark.generalmarket.infrastructure.entities.Category;
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
    CategoryWithIdDto toCategoryWithIdDto(Category category);

    List<CategoryWithIdDto> toCategoryWithIdDtoList(List<Category> categories);
}
