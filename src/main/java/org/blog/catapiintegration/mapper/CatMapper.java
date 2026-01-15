package org.blog.catapiintegration.mapper;


import org.blog.catapiintegration.dto.CatDto;
import org.ivanov.catapiintegration.model.Cat;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CatMapper {
    CatDto toDto(Cat cat);
    List<CatDto> toDto(List<Cat> cats);
}
