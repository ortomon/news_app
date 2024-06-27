package org.javaacademy.news_app.mapper;

import org.javaacademy.news_app.dto.CategoryWithNewsDto;
import org.javaacademy.news_app.dto.NewsDtoRq;
import org.javaacademy.news_app.dto.NewsDtoRs;
import org.javaacademy.news_app.entity.News;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = {NewsMapper.class})
public interface CategoryMapper {
//    @Mapping(target = "categoryName", source = "category.name")
//    NewsDtoRs convertToDto(News news);
//
//    @Mapping(target = "categoryName", source = "category.name")
//    List<CategoryWithNewsDto> convertToCategoryWithNewsDto(List<News> newsList);
}
