package org.javaacademy.news_app.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryWithNewsDto {
    private String categoryName;
    private List<NewsDtoRs> news;
}

