package org.javaacademy.news_app.controller;

import lombok.RequiredArgsConstructor;
import org.javaacademy.news_app.dto.CategoryWithNewsDto;
import org.javaacademy.news_app.dto.NewsDtoRq;
import org.javaacademy.news_app.dto.NewsDtoRs;
import org.javaacademy.news_app.entity.News;
import org.javaacademy.news_app.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping
    public List<NewsDtoRs> getNews() {
        return newsService.getNews();
    }

    @PostMapping
    public ResponseEntity createEvent(@RequestBody NewsDtoRq body) {
        newsService.createNews(body);
        return ResponseEntity.status(201).body("ура создалось");
    }

    @GetMapping("/TodayNews")
    public List<CategoryWithNewsDto> getTodaySNews() {
        return newsService.getTodaySNews();
    }

    @GetMapping("/findByCategoryAndDate")
    public List<NewsDtoRs> getNewsByDateAndCategory(@RequestParam LocalDate date, @RequestParam String categoryName) {
        return newsService.getNewsByDateAndCategory(date, categoryName);
    }
}