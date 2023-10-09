package com.example.somding_backend.dto.request.review;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewReq {
    private Long orderId;
    private String title;
    private String content;
    private float rate;

    private String photo;
}
