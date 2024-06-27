package org.javaacademy.news_app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.Data;
import org.javaacademy.news_app.entity.Category;

import java.time.LocalDate;

// тело запроса
@Data
public class NewsDtoRq {
    private String name;
    private String categoryName;
    private LocalDate localDate;
    private String text;
}
