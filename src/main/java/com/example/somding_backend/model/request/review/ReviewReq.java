package com.example.somding_backend.model.request.review;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReviewReq {
    private Long reviewId;
    private Long orderId;
    private String title;
    private String content;
    private float rate;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String photo;
}
