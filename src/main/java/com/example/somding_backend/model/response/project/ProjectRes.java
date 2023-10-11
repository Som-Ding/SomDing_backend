package com.example.somding_backend.model.response.project;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProjectRes {
    private Long projectId;
    private String title;
    private String introduce;
    private String policy;
    private String schedule;
    private LocalDateTime targetDate;
    private String category;
    private int targetPrice;
    private int price;
    private int userId;
}

