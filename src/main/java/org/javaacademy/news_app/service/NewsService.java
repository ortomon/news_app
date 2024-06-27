package org.javaacademy.news_app.service;

import lombok.RequiredArgsConstructor;
import org.javaacademy.news_app.dto.CategoryWithNewsDto;
import org.javaacademy.news_app.dto.NewsDtoRq;
import org.javaacademy.news_app.dto.NewsDtoRs;
import org.javaacademy.news_app.entity.Category;
import org.javaacademy.news_app.entity.News;
import org.javaacademy.news_app.mapper.CategoryMapper;
import org.javaacademy.news_app.mapper.NewsMapper;
import org.javaacademy.news_app.repository.CategoryRepository;
import org.javaacademy.news_app.repository.NewsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository newsRepository;
    private final CategoryRepository categoryRepository;
    private final NewsMapper newsMapper;
    private final CategoryMapper categoryMapper;

    public List<NewsDtoRs> getNews() {
        return newsMapper.convertToDto(newsRepository.findAll());
    }

    @Transactional
    public void createNews(NewsDtoRq body) {
        Category category = categoryRepository
                .findByName(body.getCategoryName())
                .orElseGet(() -> new Category(body.getCategoryName()));

        News news = newsMapper.convertToEntity(body);
        news.setCategory(category);
        newsRepository.save(news);
    }

    public List<CategoryWithNewsDto> getTodaySNews() {
        return null;
    }

    public List<NewsDtoRs> getNewsByDateAndCategory(LocalDate date, String categoryName) {
        List<News> newsList = newsRepository.findByLocalDateAndCategory_Name(date, categoryName);
        return newsMapper.convertToDto(newsList);
    }
}