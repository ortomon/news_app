package org.javaacademy.news_app.mapper;

import org.javaacademy.news_app.dto.CategoryWithNewsDto;
import org.javaacademy.news_app.dto.NewsDtoRq;
import org.javaacademy.news_app.dto.NewsDtoRs;
import org.javaacademy.news_app.entity.Category;
import org.javaacademy.news_app.entity.News;
import org.javaacademy.news_app.repository.CategoryRepository;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NewsMapper {
    News convertToEntity(NewsDtoRq newsDtoRq);
    @Mapping(target = "categoryName", source = "category.name")
    NewsDtoRs convertToDto(News news);
    List<NewsDtoRs> convertToDto(List<News> news);
}
