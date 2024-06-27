package org.javaacademy.news_app.repository;

import org.javaacademy.news_app.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByLocalDate(LocalDate localDate);

    List<News> findByLocalDateAndCategory_Name(LocalDate date, String categoryName);
}
