package com.example.somding_backend.dto.project;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectRes {
    private Long projectId;
    private String title;
    private String introduce;
    private String policy;
    private String schedule;
    private LocalDate targetDate;
    private String category;
    private int targetPrice;
    private int price;
}
