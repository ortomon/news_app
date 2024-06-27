package org.javaacademy.news_app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class NewsDtoRs {
    private String name;
    private String text;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate localDate;
    private String categoryName;
}
