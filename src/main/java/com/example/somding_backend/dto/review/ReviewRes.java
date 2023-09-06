package com.example.somding_backend.dto.review;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewRes {
    private Long reviewId;
    private Long orderId;

    private String title;
    private String content;
    private float rate;

    private LocalDate createdAt;
    private LocalDate updatedAt;

    private String photo;
}
