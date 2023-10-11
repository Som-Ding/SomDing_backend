package com.example.somding_backend.model.request.project;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ProjectReq {
    private String title;
    private String introduce;
    private String policy;
    private String schedule;
    private LocalDateTime targetDate;
    private String category;
    private int targetPrice;
    private int price;
    private String photo;
}
